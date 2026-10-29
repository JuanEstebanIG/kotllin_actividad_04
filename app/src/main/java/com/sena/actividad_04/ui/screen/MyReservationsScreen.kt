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
import com.sena.actividad_04.ui.composable.InfoNoticeBadge
import com.sena.actividad_04.ui.section.MyReservationsCardSection
import com.sena.actividad_04.ui.section.MyReservationsHeaderSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio

@Composable
fun MyReservationsScreen(
    onNavigateToDetail: (bookName: String, reservationDate: String, reservationCode: String) -> Unit
) {
    val bookName = "Clean Code"
    val reservationDate = "15/06/2026"
    val reservationCode = "RES-2026-001"

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
            MyReservationsHeaderSection()

            Spacer(modifier = Modifier.height(24.dp))

            MyReservationsCardSection(
                bookName = bookName,
                reservationDate = reservationDate,
                onViewReservationClick = {
                    onNavigateToDetail(bookName, reservationDate, reservationCode)
                }
            )
        }

        InfoNoticeBadge(
            texto = "Aquí verás todas tus reservas activas.",
            iconoResId = R.drawable.ic_info
        )
    }
}