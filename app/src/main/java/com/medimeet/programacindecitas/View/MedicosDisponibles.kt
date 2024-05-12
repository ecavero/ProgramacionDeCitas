package com.medimeet.programacindecitas.View

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

@Composable
fun MedicosDisponibles(navController: NavHostController) {
        Box(modifier = Modifier.fillMaxSize()
            .background(Color.LightGray)) {


            var buttonColor by remember { mutableStateOf(Color.Green) }

                Column{
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                    contentAlignment = Alignment.TopCenter){
                    Text("Medicos Disponibles", fontSize = 30.sp)}
                Spacer(modifier = Modifier.height(10.dp))
                Row (Modifier.padding(start = 10.dp, top = 20.dp)){
                    AsyncImage( model= ImageRequest.Builder(LocalContext.current)
                        .data("https://bit.ly/3WBIS7y")
                        .transformations(CircleCropTransformation())
                        .build(),
                        contentDescription= null,
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .clip(CircleShape)
                            .size(140.dp)
                            .border(3.dp, Color.Blue, CircleShape))
                    Spacer(modifier = Modifier.height(5.dp))
                    Column (modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
                        Text("Eduardo Gómez Sánchez", fontSize = 20.sp)
                        Text("Pacientes Atendidos: 100", fontSize = 20.sp)
                        Button(onClick = {
                                      },
                            content = {
                                Text("Confirmar Medico", fontSize = 20.sp)
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (Modifier.padding(start = 10.dp, top = 20.dp)){
                    AsyncImage( model= ImageRequest.Builder(LocalContext.current)
                        .data("https://bit.ly/3UTZRkp")
                        .transformations(CircleCropTransformation())
                        .build(),
                        contentDescription= null,
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .clip(CircleShape)
                            .size(140.dp)
                            .border(3.dp, Color.Blue, CircleShape))
                    Spacer(modifier = Modifier.height(5.dp))
                    Column (modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
                        Text("Steven Perez Salazar", fontSize = 20.sp)
                        Text("Pacientes Atendidos: 180", fontSize = 20.sp)
                        Button(onClick = {
                        },
                            content = {
                                Text("Confirmar Medico", fontSize = 20.sp)
                            }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(modifier = Modifier.padding(15.dp)) {
                    AsyncImage(
                        model = "https://bit.ly/3y9k0tI",
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.fillMaxSize()
                    )
                    IconButton(
                        modifier = Modifier.align(Alignment.CenterStart)
                            .padding(start = 70.dp, top = 70.dp)
                            .border(3.dp, Color.Red, CircleShape),
                        onClick = {
                            navController.navigate("filtrosM")
                        }) {
                        Icon(imageVector = Icons.Outlined.ArrowBackIosNew,
                            contentDescription = null,
                            tint = Color.White)
                    }

                    IconButton(
                        modifier = Modifier.align(Alignment.CenterEnd)
                            .padding(end = 90.dp, top = 70.dp)
                            .border(3.dp, Color.Green, CircleShape),
                        onClick = {
                            navController.navigate("citas")
                        }) {
                        Icon(imageVector = Icons.Outlined.ArrowForwardIos,
                            contentDescription = null,
                            tint = Color.White)
                    }
                }
            }
        }
    }
