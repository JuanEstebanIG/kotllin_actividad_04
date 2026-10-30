package com.sena.actividad_04.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.ButtonNavigation
import com.sena.actividad_04.ui.theme.MoradoPrincipal
import com.sena.actividad_04.ui.theme.TextoVerdeExito

@Composable
fun InicioActionsSection(
    onNavigateToListaLibros: () -> Unit,
    onNavigateToMyReservations: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        ButtonNavigation(
            texto = "Ver Libros",
            iconoResId = R.drawable.ic_libro,
            colorFondo = MoradoPrincipal,
            onClick = onNavigateToListaLibros
        )

        Spacer(modifier = Modifier.height(14.dp))

        ButtonNavigation(
            texto = "Ver Mis Reservas",
            iconoResId = R.drawable.ic_bookmark,
            colorFondo = TextoVerdeExito,
            onClick = onNavigateToMyReservations
        )
    }
}