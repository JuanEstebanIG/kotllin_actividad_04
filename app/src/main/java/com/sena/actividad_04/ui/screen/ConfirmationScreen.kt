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
fun ConfirmationScreen(
    reservedBookName: String,
    onNavigateToHome: () -> Unit
) {
    val currentDate = "15/06/2026"

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
                iconResId = R.drawable.ic_check_circle,
                title = "Reserva Exitosa"
            )

            Spacer(modifier = Modifier.height(40.dp))

            ReservationDetailsSection(
                bookName = reservedBookName,
                reservationDate = currentDate
            )
        }

        ButtonNavigation(
            texto = "Volver al Inicio",
            iconoResId = R.drawable.ic_home,
            colorFondo = TextoVerdeExito,
            onClick = onNavigateToHome
        )
    }
}