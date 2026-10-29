package com.sena.actividad_04.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sena.actividad_04.ui.section.BookListHeaderSection
import com.sena.actividad_04.ui.section.BookListSection
import com.sena.actividad_04.ui.theme.FondoPantallaInicio

@Composable
fun BookListScreen(
    onNavigateToDetail: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoPantallaInicio)
            .padding(horizontal = 20.dp, vertical = 24.dp)
    ) {
        BookListHeaderSection()

        Spacer(modifier = Modifier.height(24.dp))

        BookListSection(
            onBookClick = onNavigateToDetail
        )
    }
}