package com.steleot.jetpackcompose.playground.compose.externallibraries

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.imageloading.ImageLoadState
import com.google.accompanist.imageloading.LoadPainter
import com.steleot.jetpackcompose.playground.ExternalLibrariesNavRoutes
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import timber.log.Timber

private const val Url = "external/CoilScreen.kt"

@Composable
fun CoilScreen() {
    DefaultScaffold(
        title = ExternalLibrariesNavRoutes.Coil,
        link = Url,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoilImageExample()
            CoilImageExample(
                rememberCoilPainter(
                    request = "https://picsum.photos/300/300",
                    requestBuilder = {
                        transformations(CircleCropTransformation())
                    })
            )
            CoilImageExample()
        }
    }
}

@Composable
private fun CoilImageExample(
    painter: LoadPainter<Any> = rememberCoilPainter("https://picsum.photos/300/300")
) {
    Box {
        Image(
            painter = painter,
            contentDescription = "Content description",
            modifier = Modifier.size(150.dp)
        )
        when (painter.loadState) {
            ImageLoadState.Loading -> {
                Box(Modifier.matchParentSize()) {
                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                }
            }
            is ImageLoadState.Error -> {
                Image(
                    imageVector = Icons.Filled.Build,
                    contentDescription = "Vector"
                )
            }
            else -> {
                Timber.d("Else image load states")
            }
        }
    }
}
