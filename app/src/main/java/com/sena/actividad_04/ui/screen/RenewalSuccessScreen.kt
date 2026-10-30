package com.sena.actividad_04.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.ButtonNavigation
import com.sena.actividad_04.ui.composable.SuccessHeader
import com.sena.actividad_04.ui.section.ReservationDetailsSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio
import com.sena.actividad_04.ui.theme.TextoVerdeExito

@Composable
fun RenewalSuccessScreen(
    bookName: String,
    newDate: String,
    onNavigateToMyReservations: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            SuccessHeader(
                iconResId = R.drawable.ic_check,
                title = "Reserva Renovada"
            )

            Spacer(modifier = Modifier.height(40.dp))

            ReservationDetailsSection(
                bookName = bookName,
                reservationDate = newDate,
                dateLabel = "Nueva Fecha:"
            )
        }

        ButtonNavigation(
            texto = "Volver a Mis Reservas",
            iconoResId = R.drawable.ic_home,
            colorFondo = TextoVerdeExito,
            onClick = onNavigateToMyReservations
        )
    }
}