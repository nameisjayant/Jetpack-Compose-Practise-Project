package com.programming_simplified.jetpackcomposeuipratice.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programming_simplified.jetpackcomposeuipratice.R


val PoppinsBold = FontFamily(Font(R.font.poppins_bold))
val PoppinsMedium = FontFamily(Font(R.font.poppins_medium))
val PoppinsSemiBold = FontFamily(Font(R.font.poppins_semibold))
val PoppinsRegular = FontFamily(Font(R.font.poppins_regular))

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)