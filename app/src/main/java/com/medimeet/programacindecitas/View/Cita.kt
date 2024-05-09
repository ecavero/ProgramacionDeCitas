package com.medimeet.programacindecitas.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Cita (navController: NavController) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Column {
            Text(text = "Eduardo Cavero")
            TextField(value = "", onValueChange = {}, label = { Text(text = "Especialidad")} )
            TextField(value = "", onValueChange = {}, label = { Text(text = "Fecha de Cita")} )
            TextField(value = "", onValueChange = {}, label = { Text(text = "Médico")} )
            Box(

            ) {
              Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(10.dp)) {
                  Column(modifier = Modifier.padding(10.dp)) {
                      for (i: Int in 1..4) {
                         TextField(value = "", onValueChange = {} )
                      }
                  }
                  Column (modifier = Modifier.padding(10.dp)){
                      for (i: Int in 1..4) {
                          TextField(value = "", onValueChange = {} )
                      }
                  }
              }
            }
        }
    }
}