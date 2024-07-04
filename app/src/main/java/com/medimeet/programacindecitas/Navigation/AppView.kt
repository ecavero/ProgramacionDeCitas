package com.medimeet.programacindecitas.Navigation

sealed class AppView(val route: String){
    object Cita: AppView("cita")
    object DatosUsuario: AppView("datosUsuario")
    object DatosUsuario2: AppView("datosUsuario2")
    object LoginPrincipal: AppView("main")
    object RecuperarPassword: AppView("recuperar")
    object FiltroMedicos: AppView("filtrosM")
    object MedicosDisponibles: AppView("disponibles")
}

