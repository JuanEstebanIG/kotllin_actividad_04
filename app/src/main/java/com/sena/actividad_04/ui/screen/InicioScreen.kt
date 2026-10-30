package com.sena.actividad_04.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.composable.ButtonNavigation
import com.sena.actividad_04.ui.section.InicioWelcomeSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio
import com.sena.actividad_04.ui.theme.MoradoPrincipal
import com.sena.actividad_04.ui.theme.TextoVerdeExito

@Composable
fun InicioScreen(
    onNavigateToListaLibros: () -> Unit,
    onNavigateToMyReservations: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        InicioWelcomeSection(
            onNavigateToListaLibros = onNavigateToListaLibros,
            onNavigateToMyReservations = onNavigateToMyReservations
        )
    }
}