package com.sena.actividad_04.ui.section

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.composable.BookCover
import com.sena.actividad_04.ui.composable.StatusBadge
import com.sena.actividad_04.ui.theme.BlancoTarjeta
import com.sena.actividad_04.ui.theme.BordeBotonDetalle
import com.sena.actividad_04.ui.theme.NaranjaBoton
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun ReservationDetailContentSection(
    bookName: String,
    authorName: String,
    reservationDate: String,
    reservationCode: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlancoTarjeta
        ),
        border = BorderStroke(1.dp, BordeBotonDetalle),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.weight(0.4f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BookCover(
                    bookTitle = bookName,
                    authorName = authorName
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.6f)
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column {
                    Text(
                        text = "Nombre:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                    Text(
                        text = bookName,
                        fontSize = 14.sp,
                        color = TextoTitulo
                    )
                }

                Column {
                    Text(
                        text = "Autor:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                    Text(
                        text = authorName,
                        fontSize = 14.sp,
                        color = TextoTitulo
                    )
                }

                Column {
                    Text(
                        text = "Fecha Reserva:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                    Text(
                        text = reservationDate,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                }

                Column {
                    Text(
                        text = "Código Reserva:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                    Text(
                        text = reservationCode,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = NaranjaBoton
                    )
                }

                Column {
                    Text(
                        text = "Estado:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextoTitulo
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    StatusBadge(text = "Activa")
                }
            }
        }
    }
}