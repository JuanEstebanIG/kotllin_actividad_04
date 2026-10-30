package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun BookDetailRow(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            color = TextoTitulo,
            fontSize = 14.sp,
            modifier = Modifier.width(90.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = value,
            color = TextoSubtitulo,
            fontSize = 14.sp,
            modifier = Modifier.weight(1f)
        )
    }
}