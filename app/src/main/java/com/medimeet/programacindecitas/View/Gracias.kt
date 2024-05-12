package com.medimeet.programacindecitas.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun Gracias(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        AsyncImage( model = "https://bit.ly/4acHP13",
            contentDescription= null,
            modifier = Modifier.fillMaxSize(),
            contentScale= ContentScale.FillBounds)
        Button(
            onClick = { navController.navigate("main") }
        ) {
            Text("Volver al Login")// Aquí?
        }
    }

}