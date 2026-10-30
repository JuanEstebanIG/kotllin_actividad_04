package com.sena.actividad_04.ui.section

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sena.actividad_04.ui.composable.ButtonNavigation

@Composable
fun SingleButtonActionSection(
    texto: String,
    iconoResId: Int,
    colorFondo: Color,
    onClick: () -> Unit
) {
    ButtonNavigation(
        texto = texto,
        iconoResId = iconoResId,
        colorFondo = colorFondo,
        onClick = onClick
    )
}