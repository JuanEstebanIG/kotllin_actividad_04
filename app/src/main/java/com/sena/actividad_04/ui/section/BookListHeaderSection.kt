package com.sena.actividad_04.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.R
import com.sena.actividad_04.ui.theme.MoradoPrincipal
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun BookListHeaderSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_libro),
                contentDescription = "Ícono Mis Libros",
                tint = MoradoPrincipal,
                modifier = Modifier.size(26.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Mis Libros",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = TextoTitulo
            )
        }

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Elige un libro para ver más detalles",
            fontSize = 14.sp,
            color = TextoSubtitulo
        )
    }
}