package com.sena.actividad_04.ui.section

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.ConfirmationDetailRow
import com.sena.actividad_04.ui.theme.BlancoTarjeta
import com.sena.actividad_04.ui.theme.BordeVerdeTarjeta

@Composable
fun ReservationDetailsSection(
    bookName: String,
    reservationDate: String,
    dateLabel: String = "Fecha:"
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlancoTarjeta
        ),
        border = BorderStroke(1.dp, BordeVerdeTarjeta),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ConfirmationDetailRow(
                iconResId = R.drawable.ic_libro,
                label = "Libro:",
                value = bookName
            )

            ConfirmationDetailRow(
                iconResId = R.drawable.ic_calendar,
                label = dateLabel,
                value = reservationDate
            )
        }
    }
}