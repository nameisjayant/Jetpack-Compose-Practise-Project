package com.programming_simplified.jetpackcomposeuipratice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login.LandingPageScreen
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login.LoginText
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.BrandColor1
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.JetpackComposeUiPraticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            val useDarkIcons = !isSystemInDarkTheme()

            DisposableEffect(systemUiController, useDarkIcons) {
                systemUiController.setSystemBarsColor(
                    color = BrandColor1,
                    darkIcons = useDarkIcons
                )

                onDispose {}
            }
            JetpackComposeUiPraticeTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BrandColor1

                ) {
//                    LandingPageScreen()
                    LoginText()

                }

            }
        }
    }
}

