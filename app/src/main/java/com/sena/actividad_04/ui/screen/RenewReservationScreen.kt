package com.sena.actividad_04.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.section.SingleButtonActionSection
import com.sena.actividad_04.ui.section.RenewBookInfoSection
import com.sena.actividad_04.ui.section.RenewDatesSection
import com.sena.actividad_04.ui.section.TopBarHeaderSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio
import com.sena.actividad_04.ui.theme.NaranjaBoton

@Composable
fun RenewReservationScreen(
    bookName: String,
    currentDate: String,
    newDate: String,
    onBackClick: () -> Unit,
    onConfirmRenewClick: (String, String) -> Unit
) {
    val authorName = "Robert C. Martin"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 20.dp, vertical = 24.dp)
    ) {
        TopBarHeaderSection(
            title = "Renovar Reserva",
            onBackClick = onBackClick
        )

        Spacer(modifier = Modifier.height(8.dp))

        RenewBookInfoSection(
            bookName = bookName,
            authorName = authorName
        )

        Spacer(modifier = Modifier.height(32.dp))

        RenewDatesSection(
            currentDate = currentDate,
            newDate = newDate
        )

        Spacer(modifier = Modifier.weight(1f))

        SingleButtonActionSection(
            texto = "Confirmar Renovación",
            iconoResId = R.drawable.ic_check,
            colorFondo = NaranjaBoton,
            onClick = {
                onConfirmRenewClick(bookName, newDate)
            }
        )
    }
}