package com.steleot.jetpackcompose.playground.helpers

import android.app.Activity
import android.content.Context
import com.google.android.play.core.review.ReviewManagerFactory
import com.steleot.jetpackcompose.playground.datastore.ProtoManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import kotlinx.coroutines.flow.collect
import timber.log.Timber

class InAppReviewHelper @Inject constructor(
    @ApplicationContext context: Context,
    private val protoManager: ProtoManager
) {

    private val reviewManager = ReviewManagerFactory.create(context)
    private var counter: Int = 0

    suspend fun requestReview(activity: Activity) {
        if (counter >= MAX_VISITS_THRESHOLD) {
            protoManager.reviewTimeStamp.collect { timeStamp ->
                val currentTimeMillis = System.currentTimeMillis()
                if (currentTimeMillis - timeStamp >= MONTH_MILLIS) {
                    Timber.d("Requesting review")
                    try {
                        val reviewInfo = reviewManager.requestReviewFlow().await()
                        reviewManager.launchReviewFlow(activity, reviewInfo).await()
                        Timber.d("Finished review. Saving timestamp.")
                        protoManager.setReviewTimeStamp(currentTimeMillis)
                    } catch (e: Exception) {
                        Timber.e(e)
                    }
                } else {
                    Timber.d("One month hasn't been reached yet to request in app review.")
                }
            }
        } else {
            Timber.d("Increasing review counter.")
            counter++
        }
    }

    fun resetCounter() {
        counter = 0
    }

    companion object {
        private const val MAX_VISITS_THRESHOLD = 5
        private const val MONTH_MILLIS = 30L * 24L * 60L * 60L * 1_000L
    }
}