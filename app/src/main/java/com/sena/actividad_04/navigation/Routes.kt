package com.sena.actividad_04.navigation

import kotlinx.serialization.Serializable

@Serializable
data object Inicio

@Serializable
data object ListaLibros

@Serializable
data class DetalleLibro(
    val nombreLibro: String
)

@Serializable
data class ConfirmacionPrestamo(
    val nombreLibro: String
)

@Serializable
data object MyReservations

@Serializable
data class ReservationDetail(
    val bookName: String,
    val reservationDate: String,
    val reservationCode: String
)

@Serializable
data class RenewReservation(
    val bookName: String,
    val currentDate: String,
    val newDate: String
)

@Serializable
data class RenewalSuccess(
    val bookName: String,
    val newDate: String
)