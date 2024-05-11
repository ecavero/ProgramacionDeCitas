package com.medimeet.programacindecitas.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

@Composable
fun MedicoElegido(navController: NavHostController) {
Box(modifier = Modifier.fillMaxSize()){
        Column (modifier = Modifier.align(Alignment.TopCenter)) {
            Text("Medico Elegido")
            Spacer(modifier = Modifier.height(10.dp))
            Box{
                AsyncImage( model= ImageRequest.Builder(LocalContext.current)
                    .data("https://bit.ly/44B1d6W")
                    .transformations(CircleCropTransformation())
                    .crossfade(true)
                    .build(),
                    contentDescription= null,
                    modifier= Modifier.clip(CircleShape) )
            }
            Box(modifier = Modifier
                .align(Alignment.Start)
                .padding(10.dp)){
                Column {
                    Text("Especialidad Elegida")
                    Text("Calificación Elegida")
                    Text("Años De experiencia Elegida")
                    Text("Sexo Elegido")}
            }
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
    Box(modifier = Modifier.padding(15.dp)){
        AsyncImage(model = "https://bit.ly/3y9k0tI",
            contentDescription = null,
            contentScale= ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Box(modifier = Modifier
            .fillMaxSize()){
            Row(modifier = Modifier
                .align(Alignment.Center)
                //.border(3.dp, Color.Green)
                .padding(top = 54.dp, end = 20.dp)){
                IconButton(onClick = {
                    navController.navigate("Disponibles")
                }) {
                    Column {
                        Icon(
                            Icons.Filled.ArrowBackIosNew,
                            contentDescription = null,
                        )
                        Text("Regresar", fontSize = 20.sp)
                    }
                    }
                Spacer(modifier = Modifier.width(140.dp))
                IconButton(onClick = {

                }){
                    Icon(
                        Icons.Filled.ArrowForwardIos,
                        contentDescription = null,
                    )
                }
            }
        }
    }
}