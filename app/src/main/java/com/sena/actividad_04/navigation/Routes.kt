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