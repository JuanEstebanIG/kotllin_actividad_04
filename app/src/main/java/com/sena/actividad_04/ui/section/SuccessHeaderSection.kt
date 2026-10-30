package com.sena.actividad_04.ui.section

import androidx.compose.runtime.Composable
import com.sena.actividad_04.ui.composable.SuccessHeader

@Composable
fun SuccessHeaderSection(
    iconResId: Int,
    title: String
) {
    SuccessHeader(
        iconResId = iconResId,
        title = title
    )
}