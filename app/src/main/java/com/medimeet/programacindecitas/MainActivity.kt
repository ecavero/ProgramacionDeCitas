package com.medimeet.programacindecitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.medimeet.programacindecitas.View.CitaView
import com.medimeet.programacindecitas.View.DatosUsuario
import com.medimeet.programacindecitas.View.DatosUsuario2
import com.medimeet.programacindecitas.View.FiltroMedicos
import com.medimeet.programacindecitas.View.Gracias
import com.medimeet.programacindecitas.View.MedicoElegido
import com.medimeet.programacindecitas.View.MedicosDisponibles
import com.medimeet.programacindecitas.View.Recuperar
import com.medimeet.programacindecitas.View.login

import com.medimeet.programacindecitas.ui.theme.ProgramaciónDeCitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProgramaciónDeCitasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main") {
                        composable("citas") { CitaView(navController) }
                        composable("datosUsuario") { DatosUsuario(navController) }
                        composable("datosUsuario2") { DatosUsuario2(navController) }
                        composable("main"){ login(navController)}
                        composable("recuperar"){ Recuperar(navController) }
                        composable("filtrosM"){ FiltroMedicos(navController) }
                        composable("disponibles"){ MedicosDisponibles(navController)}
                        composable("gracias"){ Gracias(navController)}
                    }
                }
            }
        }
    }
}

