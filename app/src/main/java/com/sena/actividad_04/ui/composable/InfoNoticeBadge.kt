package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.BordeBotonDetalle
import com.sena.actividad_04.ui.theme.FondoBotonDetalle
import com.sena.actividad_04.ui.theme.MoradoPrincipal

@Composable
fun InfoNoticeBadge(
    texto: String,
    iconoResId: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = FondoBotonDetalle,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 1.dp,
                color = BordeBotonDetalle,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconoResId),
            contentDescription = "Información",
            tint = MoradoPrincipal,
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = texto,
            color = MoradoPrincipal,
            fontSize = 13.sp
        )
    }
}