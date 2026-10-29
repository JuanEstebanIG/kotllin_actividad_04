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
import com.sena.actividad_04.ui.composable.ParameterBadge
import com.sena.actividad_04.ui.section.BookDetailSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio
import com.sena.actividad_04.ui.theme.NaranjaBoton

@Composable
fun BookDetailScreen(

    receivedBookName: String,
    onNavigateToConfirmation: (String) -> Unit
) {
    val author = "Robert C. Martin"
    val category = "Programación"
    val description = "Guía práctica para escribir código limpio, legible y mantenible. Un clásico imprescindible para desarrolladores."

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
            ParameterBadge(
                texto = "Parámetro recibido",
                iconoResId = R.drawable.ic_download
            )

            Spacer(modifier = Modifier.height(32.dp))

            BookDetailSection(
                bookName = receivedBookName,
                authorName = author,
                category = category,
                description = description
            )
        }

        ButtonNavigation(
            texto = "Reservar Libro",
            iconoResId = R.drawable.ic_bookmark,
            colorFondo = NaranjaBoton,
            onClick = {
                onNavigateToConfirmation(receivedBookName)
            }
        )
    }
}