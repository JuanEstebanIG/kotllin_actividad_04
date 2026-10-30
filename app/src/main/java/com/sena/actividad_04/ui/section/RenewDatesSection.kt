package com.sena.actividad_04.ui.section

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.theme.BlancoTarjeta
import com.sena.actividad_04.ui.theme.BordeBotonDetalle
import com.sena.actividad_04.ui.theme.BordeInsignia
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun RenewDatesSection(
    currentDate: String,
    newDate: String
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Reserva Actual:",
            fontSize = 14.sp,
            color = TextoSubtitulo
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = BlancoTarjeta,
                    shape = RoundedCornerShape(8.dp)
                )
                .border(
                    width = 1.dp,
                    color = BordeBotonDetalle,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_calendar),
                contentDescription = "Calendario",
                tint = TextoSubtitulo,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = currentDate,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = TextoTitulo,
                modifier = Modifier.padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Nueva Fecha:",
            fontSize = 14.sp,
            color = TextoSubtitulo
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = BlancoTarjeta,
                    shape = RoundedCornerShape(8.dp)
                )
                .border(
                    width = 1.dp,
                    color = BordeInsignia,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_calendar),
                    contentDescription = "Calendario",
                    tint = TextoSubtitulo,
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = newDate,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextoTitulo,
                    modifier = Modifier.padding(start = 12.dp)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_calendar),
                contentDescription = "Seleccionar",
                tint = TextoSubtitulo,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}