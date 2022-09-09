package com.programming_simplified.jetpackcomposeuipratice.foxCrypto.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.programming_simplified.jetpackcomposeuipratice.R
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.CommonButton
import com.programming_simplified.jetpackcomposeuipratice.foxCrypto.common.Text_35_5_600
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.BrandColor1
import com.programming_simplified.jetpackcomposeuipratice.ui.theme.BrandColor2

@Preview
@Composable
fun LandingPageScreen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box {}
        Column {
            Img()
            Spacer(modifier = Modifier.height(50.dp))
            Text_35_5_600(text = stringResource(id = R.string.landing_text))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CommonButton(text = stringResource(id = R.string.signup), background = BrandColor1, textColor = BrandColor2)
            CommonButton(text = stringResource(id = R.string.login), background = BrandColor2, textColor = BrandColor1)
        }
    }
}


@Composable
fun Img(
    modifier: Modifier = Modifier
) {

    val img = painterResource(id = R.drawable.crypto)
    Image(
        painter = img, contentDescription = "",
        modifier = modifier.height(300.dp),
        contentScale = ContentScale.Crop
    )

}









