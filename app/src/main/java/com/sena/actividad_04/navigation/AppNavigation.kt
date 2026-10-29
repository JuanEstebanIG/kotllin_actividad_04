package com.sena.actividad_04.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.actividad_04.ui.screen.BookListScreen
import com.sena.actividad_04.ui.screen.InicioScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ) {
        composable<Inicio> {
            InicioScreen(
                onNavigateToListaLibros = {
                    navController.navigate(ListaLibros)
                }
            )
        }

        composable<ListaLibros> {
            BookListScreen(
                onNavigateToDetail = { bookName ->
                    navController.navigate(DetalleLibro(nombreLibro = bookName))
                }
            )
        }

        composable<DetalleLibro> { backStackEntry ->
            val args = backStackEntry.toRoute<DetalleLibro>()
        }
    }
}