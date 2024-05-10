package com.medimeet.programacindecitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.medimeet.programacindecitas.View.CitaView
import com.medimeet.programacindecitas.View.DatosUsuario
import com.medimeet.programacindecitas.View.DatosUsuario2
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
                    NavHost(navController = navController, startDestination = "datosUsuario") {
                        composable("citas") { CitaView(navController) }
                        composable("datosUsuario") { DatosUsuario(navController) }
                        composable("datosUsuario2") { DatosUsuario2(navController) }
                    }
                }
            }
        }
    }
}

