package com.sena.actividad_04.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.sena.actividad_04.ui.screen.InicioScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ){
        composable<Inicio>{
            InicioScreen(
                onNavigateToListaLibros = {
                    navController.navigate(ListaLibros)
                }
            )
        }
        composable<ListaLibros> {

        }
    }
}