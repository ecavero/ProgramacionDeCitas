package com.medimeet.programacindecitas.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  MedicosDisponibles(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        val list = listOf("Anestesiología","Cardiología","Dermatología","Endocrinología","Gastroenterología")
        val list2 = listOf("1 estrella", "2 estrellas", "3 estrellas", "4 estrellas", "5 estrellas")
        val list3 = listOf("3 años", "7 años", "10 años", "12 años", "15 años")
        val list4 = listOf("Masculino", "Femenino")

        var selectedText by remember { mutableStateOf(list[0]) }
        var selectedText2 by remember { mutableStateOf(list2[0]) }
        var selectedText3 by remember { mutableStateOf(list3[0]) }
        var selectedText4 by remember { mutableStateOf(list4[0]) }

        var isItemSelected by remember { mutableStateOf(false) }
        var isItemSelected2 by remember { mutableStateOf(false) }
        var isItemSelected3 by remember { mutableStateOf(false) }
        var isItemSelected4 by remember { mutableStateOf(false) }

        var isExpanded by remember { mutableStateOf(false) }
        var isExpanded2 by remember { mutableStateOf(false) }
        var isExpanded3 by remember { mutableStateOf(false) }
        var isExpanded4 by remember { mutableStateOf(false) }
        Column(modifier = Modifier.padding(8.dp)){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
                contentAlignment = Alignment.TopCenter){
                Text("Medicos Disponibles", fontSize = 30.sp)
            }
            ExposedDropdownMenuBox(
                expanded = isExpanded,
                onExpandedChange = { isExpanded = !isExpanded }
            ) {
                TextField(
                    modifier = Modifier.menuAnchor(),
                    value = if (isItemSelected) selectedText else "Especialidades",
                    onValueChange = {},
                    readOnly = true,
                    textStyle = TextStyle(fontSize = 20.sp),
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) }
                )

                ExposedDropdownMenu(
                    expanded = isExpanded,
                    onDismissRequest = { isExpanded = false }) {
                    list.forEachIndexed { index, text ->
                        DropdownMenuItem(
                            text = { Text(text = text,
                                fontSize = 20.sp) },
                            onClick = {
                                selectedText = list[index]
                                isItemSelected = true
                                isExpanded = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                        )
                    }
                }
            }




            Spacer(modifier = Modifier.height(10.dp))
















            ExposedDropdownMenuBox(
                expanded = isExpanded2,
                onExpandedChange = { isExpanded2 = !isExpanded2 }
            ) {
                TextField(
                    modifier = Modifier.menuAnchor(),
                    value = if (isItemSelected2) selectedText2 else "Calificaciones",
                    onValueChange = {},
                    readOnly = true,
                    textStyle = TextStyle(fontSize = 20.sp),
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded2) }
                )

                ExposedDropdownMenu(
                    expanded = isExpanded2,
                    onDismissRequest = { isExpanded2 = false }) {
                    list2.forEachIndexed { index, text ->
                        DropdownMenuItem(
                            text = { Text(text = text,
                                fontSize = 20.sp) },
                            onClick = {
                                selectedText2 = list2[index]
                                isItemSelected2 = true
                                isExpanded2 = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                        )
                    }
                }
            }







            Spacer(modifier = Modifier.height(10.dp))










            ExposedDropdownMenuBox(
                expanded = isExpanded3,
                onExpandedChange = { isExpanded3 = !isExpanded3 }
            ) {
                TextField(
                    modifier = Modifier.menuAnchor(),
                    value = if (isItemSelected3) selectedText3 else "Años de Experiencia",
                    onValueChange = {},
                    readOnly = true,
                    textStyle = TextStyle(fontSize = 20.sp),
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded3) }
                )

                ExposedDropdownMenu(
                    expanded = isExpanded3,
                    onDismissRequest = { isExpanded3 = false }) {
                    list3.forEachIndexed { index, text ->
                        DropdownMenuItem(
                            text = { Text(text = text,
                                fontSize = 20.sp) },
                            onClick = {
                                selectedText3 = list3[index]
                                isItemSelected3 = true
                                isExpanded3 = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                        )
                    }
                }
            }















            Spacer(modifier = Modifier.height(10.dp))





            ExposedDropdownMenuBox(
                expanded = isExpanded4,
                onExpandedChange = { isExpanded4 = !isExpanded4 }
            ) {
                TextField(
                    modifier = Modifier.menuAnchor(),
                    value = if (isItemSelected4) selectedText4 else "Sexo",
                    onValueChange = {},
                    readOnly = true,
                    textStyle = TextStyle(fontSize = 20.sp),
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded4)}
                )
                ExposedDropdownMenu(
                    expanded = isExpanded4,
                    onDismissRequest = { isExpanded4 = false }) {
                    list4.forEachIndexed { index, text ->
                        DropdownMenuItem(
                            text = { Text(text = text,
                                fontSize = 20.sp) },
                            onClick = {
                                selectedText4 = list4[index]
                                isItemSelected4 = true
                                isExpanded4 = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                        )
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
                    Row(modifier = Modifier.align(Alignment.Center)
                        //.border(3.dp, Color.Green)
                        .padding(top = 54.dp, end = 20.dp)){
                        IconButton(onClick = {

                        }) {
                            Icon(
                                Icons.Filled.ArrowBackIosNew,
                                contentDescription = null,
                            )
                            Text("Regresar")
                        }
                        Spacer(modifier = Modifier.width(140.dp))
                        IconButton(onClick = {
                            navController.navigate("Elegido")
                        }){
                            Icon(
                                Icons.Filled.ArrowForwardIos,
                                contentDescription = null,
                            )
                            Text("Confirmar")
                        }
                    }
                }
            }
        }
    }
}