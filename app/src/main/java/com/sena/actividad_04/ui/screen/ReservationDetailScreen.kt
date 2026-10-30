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
import com.sena.actividad_04.ui.section.ActionButtonsSection
import com.sena.actividad_04.ui.section.InfoNoticeSection
import com.sena.actividad_04.ui.section.SuccessNoticeSection
import com.sena.actividad_04.ui.section.ReservationDetailContentSection
import com.sena.actividad_04.ui.section.TopBarHeaderSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio

@Composable
fun ReservationDetailScreen(
    bookName: String,
    reservationDate: String,
    reservationCode: String,
    onBackClick: () -> Unit,
    onRenewClick: (String, String) -> Unit,
    onCancelClick: () -> Unit
) {
    val authorName = "Robert C. Martin" // Hardcoded, can be passed if needed

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 20.dp, vertical = 24.dp)
    ) {
        TopBarHeaderSection(
            title = "Detalle de Reserva",
            onBackClick = onBackClick
        )

        SuccessNoticeSection(
            texto = "Argumentos recibidos",
            iconoResId = R.drawable.ic_check_circle
        )

        Spacer(modifier = Modifier.height(24.dp))

        ReservationDetailContentSection(
            bookName = bookName,
            authorName = authorName,
            reservationDate = reservationDate,
            reservationCode = reservationCode
        )

        Spacer(modifier = Modifier.height(24.dp))

        InfoNoticeSection(
            texto = "Estos datos fueron enviados desde\nla pantalla anterior como parámetros.",
            iconoResId = R.drawable.ic_info
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionButtonsSection(
            onRenewClick = { onRenewClick(bookName, reservationDate) },
            onCancelClick = onCancelClick
        )
    }
}