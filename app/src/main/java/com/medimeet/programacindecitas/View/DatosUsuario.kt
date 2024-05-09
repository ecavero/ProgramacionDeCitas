package com.medimeet.programacindecitas.View

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun DatosUsuarios(navController: NavController) {
   Box(contentAlignment = Alignment.TopCenter) {
                AsyncImage(
                    model = "https://static1.srcdn.com/wordpress/wp-content/uploads/2021/10/Jujutsu-Kaisen-itadori-hidden-power-theory.jpg?q=50&fit=contain&w=1140&h=&dpr=1.5",
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .clip(CircleShape)
                        .border(5.dp, Color.Black, CircleShape)
                )
   }
    Box(modifier = Modifier, contentAlignment = Alignment.TopCenter){
        Column() {
            Text(text = " ")
            Spacer(modifier = Modifier.height(250.dp))
            Text(text = "Nombres Completos :")
            TextField(value = "", onValueChange = {} )
            Text(text = "DNI :")
            TextField(value = "", onValueChange = {} )
            Text(text = "Telefono :")
            TextField(value = "", onValueChange = {} )
            Text(text = "Nro Paciente :")
            Text(text = "Historial Clinico :")
            Row(modifier = Modifier
            ) {
                Button(onClick = {}, modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .clip(CircleShape),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Icon(imageVector = Icons.Default.Create,contentDescription = "null")
                }
                Spacer(modifier = Modifier
                    .width(80.dp)
                )
                Button(onClick = {}, modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .clip(CircleShape),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Icon(imageVector = Icons.Default.Check,contentDescription = "null")
                }
            }
        }
    }
}
