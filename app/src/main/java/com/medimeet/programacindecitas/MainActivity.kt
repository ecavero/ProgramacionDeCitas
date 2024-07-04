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
import androidx.room.Room
import com.medimeet.programacindecitas.Navigation.NavigationView
import com.medimeet.programacindecitas.Room.FiltroMedicosDatabase
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
                val database = Room.databaseBuilder(
                    this, FiltroMedicosDatabase::class.java, "db_filtro")
                    .build()
                NavigationView()
            }
        }
    }
}

//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.primary
//                )