package com.sena.actividad_04.ui.section

import androidx.compose.runtime.Composable
import com.sena.actividad_04.ui.composable.ParameterBadge

@Composable
fun ParameterBadgeSection(
    texto: String,
    iconoResId: Int
) {
    ParameterBadge(
        texto = texto,
        iconoResId = iconoResId
    )
}