package com.steleot.jetpackcompose.playground.compose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.animatedVectorResource
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.R
import com.steleot.jetpackcompose.playground.UiNavRoutes
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import java.util.*

@Composable
fun AnimatedVectorScreen() {
    DefaultScaffold(
        title = UiNavRoutes.AnimatedVector.capitalize(Locale.getDefault())
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatorVectorExample()
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun AnimatorVectorExample() {
    val image = animatedVectorResource(R.drawable.animated_vector_example)
    var atEnd by remember { mutableStateOf(false) }
    Image(
        painter = image.painterFor(atEnd),
        contentDescription = "Jetpack compose playground",
        modifier = Modifier.size(64.dp).clickable {
            atEnd = !atEnd
        }
    )
}