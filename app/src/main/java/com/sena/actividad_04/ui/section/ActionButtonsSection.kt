package com.sena.actividad_04.ui.section

import androidx.compose.runtime.Composable
import com.sena.actividad_04.ui.composable.ActionButtonsRow

@Composable
fun ActionButtonsSection(
    onRenewClick: () -> Unit,
    onCancelClick: () -> Unit
) {
    ActionButtonsRow(
        onRenewClick = onRenewClick,
        onCancelClick = onCancelClick
    )
}