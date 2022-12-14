package com.programming_simplified.jetpackcomposeuipratice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login.LandingPageScreen
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login.LoginPageScreen
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.verifying_account.OtpScreen
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.BrandColor1
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.JetpackComposeUiPraticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeUiPraticeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BrandColor1
                ) {
                   LoginPageScreen()
                }
            }
        }
    }
}
