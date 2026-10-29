package com.sena.actividad_04.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.actividad_04.ui.screen.BookDetailScreen
import com.sena.actividad_04.ui.screen.BookListScreen
import com.sena.actividad_04.ui.screen.ConfirmationScreen
import com.sena.actividad_04.ui.screen.InicioScreen
import com.sena.actividad_04.ui.screen.MyReservationsScreen

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

            BookDetailScreen(
                receivedBookName = args.nombreLibro,
                onNavigateToConfirmation = { bookName ->
                    navController.navigate(ConfirmacionPrestamo(nombreLibro = bookName))
                }
            )
        }

        composable<ConfirmacionPrestamo> { backStackEntry ->
            val args = backStackEntry.toRoute<ConfirmacionPrestamo>()

            ConfirmationScreen(
                reservedBookName = args.nombreLibro,
                onNavigateToHome = {
                    navController.navigate(MyReservations) {
                        popUpTo(Inicio) {
                            inclusive = false
                        }
                    }
                }
            )
        }

        composable<MyReservations> {
            MyReservationsScreen(
                onNavigateToDetail = { bookName, reservationDate, reservationCode ->
                    navController.navigate(
                        ReservationDetail(
                            bookName = bookName,
                            reservationDate = reservationDate,
                            reservationCode = reservationCode
                        )
                    )
                }
            )
        }
    }
}