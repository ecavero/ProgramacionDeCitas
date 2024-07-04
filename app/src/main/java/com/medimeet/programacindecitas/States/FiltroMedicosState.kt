package com.medimeet.programacindecitas.States

import com.medimeet.programacindecitas.Models.FiltroMedicos

data class FiltroMedicosState(

    val userId: Int? = null,
    val especialidad: String = "",
    val calificacion: String = "",
    val años: Double = 0.0,
    val sexo: String = "",
    val listfiltrado: List<FiltroMedicos> = emptyList()
)