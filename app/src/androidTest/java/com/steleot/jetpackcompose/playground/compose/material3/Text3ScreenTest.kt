package com.steleot.jetpackcompose.playground.compose.material3

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.steleot.jetpackcompose.playground.MainActivity
import com.steleot.jetpackcompose.playground.compose.theme.TestTheme3
import org.junit.Rule
import org.junit.Test

class Text3ScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testText3Screen() {
        composeTestRule.setContent {
            TestTheme3 {
                Text3Screen()
            }
        }
        // todo
    }
}