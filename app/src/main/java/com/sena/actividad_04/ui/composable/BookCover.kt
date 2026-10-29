package com.sena.actividad_04.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.theme.PortadaLibroFondo

@Composable
fun BookCover(
    bookTitle: String,
    authorName: String
) {
    Box(
        modifier = Modifier
            .width(140.dp)
            .height(200.dp)
            .background(
                color = PortadaLibroFondo,
                shape = RoundedCornerShape(8.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = bookTitle,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = authorName,
                color = Color.LightGray,
                fontSize = 10.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}