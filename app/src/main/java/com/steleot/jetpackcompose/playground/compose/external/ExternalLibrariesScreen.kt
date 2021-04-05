package com.steleot.jetpackcompose.playground.compose.external

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.steleot.jetpackcompose.playground.ExternalLibrariesNavRoutes
import com.steleot.jetpackcompose.playground.MainNavRoutes
import com.steleot.jetpackcompose.playground.compose.MainScreen
import java.util.Locale

val routes = listOf(
    ExternalLibrariesNavRoutes.Coil,
    ExternalLibrariesNavRoutes.FlowLayout,
    ExternalLibrariesNavRoutes.Glide,
//    ExternalLibrariesNavRoutes.IconPack,
//    ExternalLibrariesNavRoutes.Insets,
    ExternalLibrariesNavRoutes.Lottie,
    ExternalLibrariesNavRoutes.Pager,
    ExternalLibrariesNavRoutes.SystemUiController,
)

@Composable
fun ExternalLibrariesScreen(navController: NavHostController) {
    MainScreen(
        navController = navController,
        title = MainNavRoutes.ExternalLibraries.capitalize(Locale.getDefault()),
        list = routes,
        showBackArrow = true,
    )
}