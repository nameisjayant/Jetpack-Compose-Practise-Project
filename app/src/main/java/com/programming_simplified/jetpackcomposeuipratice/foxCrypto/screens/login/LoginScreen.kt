package com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.programming_simplified.jetpackcomposeuipratice.R
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonHeader
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonLargeButton
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonTextField


@Composable
fun LoginPageScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        CommonHeader(text = stringResource(id = R.string.login))
        Spacer(modifier = Modifier.height(20.dp))
        CommonTextField(
            textLabel = stringResource(id = R.string.email),
            text = email,
            placeholder = stringResource(id = R.string.enter_email),
            onValueChange = {
                email = it

            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        CommonTextField(
            textLabel = stringResource(id = R.string.password),
            text = password,
            placeholder = stringResource(id = R.string.enter_password),
            onValueChange = {
                password = it
            }
        )
        Spacer(modifier = Modifier.height(50.dp))
        CommonLargeButton(text = stringResource(id = R.string.login))
    }

}






