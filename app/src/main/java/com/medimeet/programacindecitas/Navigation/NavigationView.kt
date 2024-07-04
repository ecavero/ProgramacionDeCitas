package com.medimeet.programacindecitas.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.medimeet.programacindecitas.View.CitaView
import com.medimeet.programacindecitas.View.DatosUsuario
import com.medimeet.programacindecitas.View.DatosUsuario2
import com.medimeet.programacindecitas.View.FiltroMedicos
import com.medimeet.programacindecitas.View.Gracias
import com.medimeet.programacindecitas.View.MedicosDisponibles
import com.medimeet.programacindecitas.View.Recuperar
import com.medimeet.programacindecitas.View.login

@Composable
fun NavigationView() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("citas") { CitaView(navController) }
        composable("datosUsuario") { DatosUsuario(navController) }
        composable("datosUsuario2") { DatosUsuario2(navController) }
        composable("main"){ login(navController) }
        composable("recuperar"){ Recuperar(navController) }
        composable("filtrosM"){ FiltroMedicos(navController) }
        composable("disponibles"){ MedicosDisponibles(navController) }
        composable("gracias"){ Gracias(navController) }
    }
}