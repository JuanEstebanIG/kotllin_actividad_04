package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.BordeVerdeTarjeta
import com.sena.actividad_04.ui.theme.FondoVerdeIcono
import com.sena.actividad_04.ui.theme.TextoVerdeExito

@Composable
fun StatusBadge(
    text: String = "Activa"
) {
    Box(
        modifier = Modifier
            .background(
                color = FondoVerdeIcono,
                shape = CircleShape
            )
            .border(
                width = 1.dp,
                color = BordeVerdeTarjeta,
                shape = CircleShape
            )
            .padding(horizontal = 14.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            color = TextoVerdeExito,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
    }
}