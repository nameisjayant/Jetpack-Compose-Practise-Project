package com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.verifying_account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.programming_simplified.jetpackcomposeuipratice.R
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonHeader
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonLargeButton


@Preview
@Composable
fun OtpScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CommonHeader(text = stringResource(id = R.string.Verification))

        CommonLargeButton(text = stringResource(id = R.string.verify) )
    }

}