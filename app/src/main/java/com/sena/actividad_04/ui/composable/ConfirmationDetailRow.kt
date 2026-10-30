package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo
import com.sena.actividad_04.ui.theme.TextoVerdeExito

@Composable
fun ConfirmationDetailRow(
    iconResId: Int,
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = label,
            tint = TextoVerdeExito,
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = TextoSubtitulo,
            modifier = Modifier.width(60.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = value,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = TextoTitulo,
            modifier = Modifier.weight(1f)
        )
    }
}