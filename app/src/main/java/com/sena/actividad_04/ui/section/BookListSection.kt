package com.sena.actividad_04.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.BookCardItem
import com.sena.actividad_04.ui.theme.ColorLibroAzul
import com.sena.actividad_04.ui.theme.ColorLibroCeleste
import com.sena.actividad_04.ui.theme.ColorLibroNaranja
import com.sena.actividad_04.ui.theme.ColorLibroVerde

@Composable
fun BookListSection(
    onBookClick: (String) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {

        BookCardItem(
            bookTitle = "Clean Code",
            iconResId = R.drawable.ic_libro,
            bookColor = ColorLibroAzul,
            onDetailClick = {
                onBookClick("Clean Code")
            }
        )

        BookCardItem(
            bookTitle = "Kotlin para\nAndroid",
            iconResId = R.drawable.ic_android,
            bookColor = ColorLibroVerde,
            onDetailClick = {
                onBookClick("Kotlin para Android")
            }
        )

        BookCardItem(
            bookTitle = "Arquitectura\nde Software",
            iconResId = R.drawable.ic_arquitectura,
            bookColor = ColorLibroNaranja,
            onDetailClick = {
                onBookClick("Arquitectura de Software")
            }
        )

        BookCardItem(
            bookTitle = "Jetpack\nCompose",
            iconResId = R.drawable.ic_compose,
            bookColor = ColorLibroCeleste,
            onDetailClick = {
                onBookClick("Jetpack Compose")
            }
        )
    }
}