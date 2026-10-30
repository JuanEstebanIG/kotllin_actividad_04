package com.sena.actividad_04.ui.section

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_04.ui.composable.BookCover
import com.sena.actividad_04.ui.theme.BlancoTarjeta
import com.sena.actividad_04.ui.theme.BordeBotonDetalle
import com.sena.actividad_04.ui.theme.TextoSubtitulo
import com.sena.actividad_04.ui.theme.TextoTitulo

@Composable
fun RenewBookInfoSection(
    bookName: String,
    authorName: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlancoTarjeta
        ),
        border = BorderStroke(1.dp, BordeBotonDetalle),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(0.4f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BookCover(
                    bookTitle = bookName,
                    authorName = authorName
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.6f)
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "Libro:",
                    fontSize = 13.sp,
                    color = TextoSubtitulo
                )
                Text(
                    text = bookName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextoTitulo
                )
            }
        }
    }
}