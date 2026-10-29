package com.sena.actividad_04.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.ButtonNavigation
import com.sena.actividad_04.ui.composable.StatusBadge
import com.sena.actividad_04.ui.theme.BlancoTarjeta
import com.sena.actividad_04.ui.theme.MoradoPrincipal
import com.sena.actividad_04.ui.theme.PortadaLibroFondo
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun MyReservationsCardSection(
    bookName: String,
    reservationDate: String,
    onViewReservationClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlancoTarjeta
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .width(75.dp)
                        .height(105.dp)
                        .background(
                            color = PortadaLibroFondo,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = bookName,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "Libro:",
                        fontSize = 13.sp,
                        color = TextoSubtitulo
                    )
                    Text(
                        text = bookName,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Fecha:",
                        fontSize = 13.sp,
                        color = TextoSubtitulo
                    )
                    Text(
                        text = reservationDate,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TextoTitulo
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Estado:",
                        fontSize = 13.sp,
                        color = TextoSubtitulo
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    StatusBadge(text = "Activa")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            ButtonNavigation(
                texto = "Ver Reserva",
                iconoResId = R.drawable.ic_eye,
                colorFondo = MoradoPrincipal,
                onClick = onViewReservationClick
            )
        }
    }
}