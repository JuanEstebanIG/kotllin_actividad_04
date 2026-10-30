package com.sena.actividad_04.ui.section

import androidx.compose.runtime.Composable
import com.sena.actividad_04.ui.composable.InfoNoticeBadge
import com.sena.actividad_04.ui.composable.SuccessNoticeBadge

@Composable
fun InfoNoticeSection(
    texto: String,
    iconoResId: Int
) {
    InfoNoticeBadge(
        texto = texto,
        iconoResId = iconoResId
    )
}

@Composable
fun SuccessNoticeSection(
    texto: String,
    iconoResId: Int
) {
    SuccessNoticeBadge(
        texto = texto,
        iconoResId = iconoResId
    )
}