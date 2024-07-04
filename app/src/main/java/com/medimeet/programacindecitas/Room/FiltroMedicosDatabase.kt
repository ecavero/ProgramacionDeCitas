package com.medimeet.programacindecitas.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.medimeet.programacindecitas.Models.FiltroMedicos

@Database(
    entities = [FiltroMedicos::class],
    version = 1,
    exportSchema = false
)
abstract class FiltroMedicosDatabase:RoomDatabase() {
    abstract fun filtroMedicosDao(): FiltroMedicosDatabaseDao
}
