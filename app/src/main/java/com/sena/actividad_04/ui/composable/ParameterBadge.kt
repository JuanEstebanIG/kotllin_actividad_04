package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.BordeInsignia
import com.sena.actividad_04.ui.theme.FondoInsignia
import com.sena.actividad_04.ui.theme.TextoNaranja

@Composable
fun ParameterBadge(
    texto: String,
    iconoResId: Int
) {
    Row(
        modifier = Modifier
            .background(
                color = FondoInsignia,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                width = 1.5.dp,
                color = BordeInsignia,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = iconoResId),
            contentDescription = "Ícono Parámetro",
            tint = TextoNaranja,
            modifier = Modifier.size(18.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = texto,
            color = TextoNaranja,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
    }
}