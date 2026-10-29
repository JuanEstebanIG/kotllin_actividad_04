package com.sena.actividad_04.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.theme.CirculoFondoIcono
import com.sena.actividad_04.ui.theme.FondoPantallaInicio
import com.sena.actividad_04.ui.theme.MoradoPrincipal
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo


@Composable
fun InicioScreen(
    onNavigateToListaLibros: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Box(
            modifier = Modifier
                .size(190.dp)
                .background(
                    color = CirculoFondoIcono,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_biblioteca),
                contentDescription = "Ilustración de Biblioteca",
                modifier = Modifier.size(130.dp)
            )
        }

        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = "¡Bienvenido a tu\nBiblioteca!",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = TextoTitulo,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Descubre, aprende y reserva\ntus libros favoritos.",
            fontSize = 15.sp,
            color = TextoSubtitulo,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp
        )

        Spacer(modifier = Modifier.height(48.dp))

        Button(
            onClick = onNavigateToListaLibros,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MoradoPrincipal,
                contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp,
                pressedElevation = 8.dp
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_libro),
                contentDescription = "Ícono Ver Libros",
                modifier = Modifier.size(20.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Ver Libros",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}