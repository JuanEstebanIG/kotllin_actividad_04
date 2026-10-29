package com.sena.actividad_04.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.ui.composable.BookCover
import com.sena.actividad_04.ui.composable.BookDetailRow

@Composable
fun BookDetailSection(
    bookName: String,
    authorName: String,
    category: String,
    description: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BookCover(
            bookTitle = bookName,
            authorName = authorName
        )

        Spacer(modifier = Modifier.height(32.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            BookDetailRow(label = "Nombre:", value = bookName)
            BookDetailRow(label = "Autor:", value = authorName)
            BookDetailRow(label = "Categoría:", value = category)
            BookDetailRow(label = "Descripción:", value = description)
        }
    }
}