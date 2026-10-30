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
                },
                onNavigateToMyReservations = {
                    navController.navigate(MyReservations)
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
                    navController.navigate(Inicio) {
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

        composable<ReservationDetail> { backStackEntry ->
            val args = backStackEntry.toRoute<ReservationDetail>()
            
            com.sena.actividad_04.ui.screen.ReservationDetailScreen(
                bookName = args.bookName,
                reservationDate = args.reservationDate,
                reservationCode = args.reservationCode,
                onBackClick = {
                    navController.popBackStack()
                },
                onRenewClick = { bookName, currentDate ->
                    navController.navigate(
                        RenewReservation(
                            bookName = bookName,
                            currentDate = currentDate,
                            newDate = "30/06/2026"
                        )
                    )
                },
                onCancelClick = {
                    navController.popBackStack() // In a real app, maybe show a dialog or navigate to a "canceled" screen
                }
            )
        }

        composable<RenewReservation> { backStackEntry ->
            val args = backStackEntry.toRoute<RenewReservation>()

            com.sena.actividad_04.ui.screen.RenewReservationScreen(
                bookName = args.bookName,
                currentDate = args.currentDate,
                newDate = args.newDate,
                onBackClick = {
                    navController.popBackStack()
                },
                onConfirmRenewClick = { bookName, newDate ->
                    navController.navigate(
                        RenewalSuccess(
                            bookName = bookName,
                            newDate = newDate
                        )
                    )
                }
            )
        }
        
        composable<RenewalSuccess> { backStackEntry ->
            val args = backStackEntry.toRoute<RenewalSuccess>()
            
            com.sena.actividad_04.ui.screen.RenewalSuccessScreen(
                bookName = args.bookName,
                newDate = args.newDate,
                onNavigateToMyReservations = {
                    navController.navigate(MyReservations) {
                        popUpTo(Inicio) {
                            inclusive = false
                        }
                    }
                }
            )
        }
    }
}