package com.medimeet.programacindecitas.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage


//@Preview(showBackground = true, widthDp = 360, heightDp = 560)
@Composable
fun login(navController: NavHostController) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        var valor1 by remember { mutableStateOf("") }
        var valor2 by remember { mutableStateOf("") }

        Column (horizontalAlignment = Alignment.CenterHorizontally){
            AsyncImage(model = "https://w7.pngwing.com/pngs/83/1024/png-transparent-physician-caduceus-as-a-symbol-of-medicine-caduceus-as-a-symbol-of-medicine-healthcare-s-text-logo-medicine-thumbnail.png",
                contentDescription =null ,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))

            Text(text = "Omniamedica grupovital", color = Color.Blue, fontSize = 25.sp, fontWeight= FontWeight.Bold)

            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                value = valor1,
                onValueChange ={ val1 -> valor1 = val1 },
                label = { Text(text = "Ingrese Email")},
                placeholder = { Text("Email") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "correo")},
                modifier = Modifier
                    .size(250.dp, 70.dp)
                )
            Spacer(modifier = Modifier.size(5.dp))
            OutlinedTextField(
                value =valor2 ,
                onValueChange ={val2->valor2=val2},
                label = { Text(text = "Ingrese contraseña")},
                placeholder = { Text(text = "Contraseña")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "contraseña")},
                modifier = Modifier
                    .size(250.dp, 70.dp)
            )
            Spacer(modifier = Modifier.size(50.dp))
            TextButton(onClick = { navController.navigate("recuperar") }) {
                Text(text = "Olvidaste la contraseña?", color = Color.White)

            }
            Button(onClick = { navController.navigate("datosUsuario") },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                modifier = Modifier.size(250.dp,50.dp))
            {      
                Text(text = "Ingresar", fontSize = 15.sp)

            }
        }
    }
}