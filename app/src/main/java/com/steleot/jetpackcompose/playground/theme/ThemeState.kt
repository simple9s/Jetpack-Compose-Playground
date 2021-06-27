package com.steleot.jetpackcompose.playground.theme

data class ThemeState(
    var pallete: ColorPallete = ColorPallete.PURPLE,
    var isDarkTheme: Boolean = false,
)