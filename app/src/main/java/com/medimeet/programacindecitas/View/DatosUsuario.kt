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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var editando by remember { mutableStateOf(false) }
    var nombreCompleto by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column( ) {
            Spacer(modifier = Modifier.height(30.dp))
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
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Nombres Completos : $nombreCompleto")
            if (editando){
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = nombreCompleto,
                    onValueChange = { nombreCompleto = it },
                    label = { Text("Nuevo Nombre Completo") },
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "DNI : $dni")
            if (editando){
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = dni,
                    onValueChange = { dni = it },
                    label = { Text("Nuevo DNI") },
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Telefono : $telefono")
            if (editando){
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = telefono,
                    onValueChange = { telefono = it },
                    label = { Text("Nuevo Telefono") },
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Nro Paciente :")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Historial Clinico :")
            Spacer(modifier = Modifier.height(50.dp))
            Row {
                Button(
                    onClick = { editando = true },
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(Color.Red)
                ) {
                    Icon(imageVector = Icons.Default.Create, contentDescription = "Editar")
                }

                Spacer(modifier = Modifier.width(100.dp))

                Button(
                    onClick = {
                        navController.navigate("datosUsuario2")
                    },
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "aceptar")
                }
            }
        }
    }
}



