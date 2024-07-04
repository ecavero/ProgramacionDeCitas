package com.medimeet.programacindecitas.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "filtromedicos")
data class FiltroMedicos(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    @ColumnInfo("especialidad")
    val especialidad : String,
    @ColumnInfo("calificacion")
    val calificacion : String,
    @ColumnInfo("años")
    val años : Double,
    @ColumnInfo("sexo")
    val sexo : String,
)