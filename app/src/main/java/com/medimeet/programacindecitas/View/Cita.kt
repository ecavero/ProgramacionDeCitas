package com.medimeet.programacindecitas.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CitaView (navController: NavHostController) {
    val especialidadaes = listOf("Especialidad 1", "Especialidad 2", "Especialidad 3")
    var especialidadVisible by remember { mutableStateOf(false) }
    var especialidadSeleccionada by remember { mutableStateOf <String?>(null)}

    val medicos = listOf("Médico 1", "Médico 2", "Médico 3")
    var medicoVisible by remember { mutableStateOf(false) }
    var medicoSeleccionado by remember { mutableStateOf<String?>(null) }
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Nombre del paciente:")
            TextField(
                value = "Eduardo Cavero Guzmán",
                onValueChange = { },
                enabled = false,
                modifier = Modifier.fillMaxWidth(),
            )
            Text("Espacialidad:")
            Row(verticalAlignment = Alignment.CenterVertically) {
                DropdownMenu(
                    modifier = Modifier.fillMaxWidth(),
                    expanded = especialidadVisible, // Change to true to see the dropdown
                    onDismissRequest = {especialidadVisible = false},
                ) {
                    especialidadaes.forEach { especialidad ->
                        DropdownMenuItem(
                            text = { Text(text = especialidad)},
                            onClick = {
                                especialidadSeleccionada = especialidad
                                especialidadVisible = false
                            }
                        )
                    }
                }
                Button(onClick = { especialidadVisible = true }) {
                    Text(text = especialidadSeleccionada ?: "Seleccionar")
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
                }
            }
            Text("Fecha de Cita:")
            TextField(
                value = "__/__/____",
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
            )
            Text("Médico:")
            Row {
                DropdownMenu(
                    modifier = Modifier.fillMaxWidth(),
                    expanded = medicoVisible, // Change to true to see the dropdown
                    onDismissRequest = {medicoVisible = false},
                ) {
                    medicos.forEach { medico ->
                        DropdownMenuItem(
                            text = { Text(text = medico)},
                            onClick = {
                                medicoSeleccionado = medico
                                medicoVisible = false
                            }
                        )
                    }
                }
                Button(onClick = { medicoVisible = true }) {
                    Text(text = medicoSeleccionado ?: "Seleccionar")
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
                }
            }

            repeat(4) {i ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    TextField(
                        value = "${ 2 * i + 1}:00",
                        onValueChange = { },
                        enabled = false,
                        modifier = Modifier.weight(1f),
                    )
                    TextField(
                        value = "${ 2 * i + 2}:00",
                        onValueChange = { },
                        enabled = false,
                        modifier = Modifier.weight(1f),
                    )
                }
            }
            Button(
                onClick = { /* Handle confirmation */ },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Confirmar")
            }
        }
    }
}