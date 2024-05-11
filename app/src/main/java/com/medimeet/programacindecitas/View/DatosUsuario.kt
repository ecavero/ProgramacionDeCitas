package com.medimeet.programacindecitas.View

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

@Composable
fun DatosUsuario(navController: NavController) {
    Scaffold (
        topBar = { miBarraSuperior(navController)},
        content = { paddingInterno ->
            Surface(modifier = Modifier.padding(paddingInterno)){
                miContenido(navController)
            }

        },
        bottomBar = { miBarraInferior(navController)},
        floatingActionButton = { miBotonFlotante(navController)}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun miBarraSuperior(navController: NavController) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
            titleContentColor = MaterialTheme.colorScheme.surface
        ),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { navController.navigate("citas")}) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null )
                }
                Text("MEDICMEET")
            }
        }
        /*actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.TwoTone.Home, contentDescription =null )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription =null )
            }
        }*/
    )
}

@Composable
fun miContenido(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column() {
            Box(contentAlignment = Alignment.TopCenter) {
                AsyncImage(
                    model = "https://i.blogs.es/28f6bb/tom-ford/450_1000.jpg",
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                        .border(5.dp, Color.Black, CircleShape)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Nombres Completos :")
            TextField(value = "", onValueChange = {} )

            Text(text = "DNI :")
            TextField(value = "", onValueChange = {} )

            Text(text = "Telefono :")
            TextField(value = "", onValueChange = {} )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Nro Paciente :")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Historial Clinico :")
            Spacer(modifier = Modifier.height(60.dp))

            Row {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(Color.Red)
                ) {
                    Icon(imageVector = Icons.Default.Create,contentDescription = "null")
                }

                Spacer(modifier = Modifier.width(110.dp))

                Button(
                    onClick = {
                        navController.navigate("datosUsuario2")
                    },
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(Color.Green)
                ) {
                    Icon(imageVector = Icons.Default.Check,contentDescription = "null")
                }
            }
        }
    }
}

@Composable
fun miBarraInferior(navController: NavController) {
    /*BottomAppBar(
        containerColor = MaterialTheme.colorScheme.error,
        contentColor = MaterialTheme.colorScheme.surface,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Home , contentDescription =null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.AccountCircle , contentDescription =null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.LocationOn , contentDescription =null)
            }
        }
    }*/
}

@Composable
fun miBotonFlotante(navController: NavController) {
   /* FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Home, contentDescription = null)
    }*/
}
