package com.medimeet.programacindecitas.Room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.medimeet.programacindecitas.Models.FiltroMedicos
import kotlinx.coroutines.flow.Flow

@Dao
interface FiltroMedicosDatabaseDao {
    @Query("Select * from filtromedicos Order by especialidad ASC")
    fun obtenerfiltromedicos(): Flow<List<FiltroMedicos>>

    @Query("Select * from filtromedicos where id = :id")
    fun obtenerfiltromedicos(id:Int): Flow<FiltroMedicos>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarfiltromedicos(filtroMedicos: FiltroMedicos)

    @Update()
    suspend fun actualizarfiltromedicos(filtroMedicos: FiltroMedicos)

    @Delete()
    suspend fun borrarfiltromedicos(filtroMedicos: FiltroMedicos)
}
