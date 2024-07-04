package com.medimeet.programacindecitas.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.medimeet.programacindecitas.Models.FiltroMedicos
import com.medimeet.programacindecitas.Room.FiltroMedicosDatabaseDao
import com.medimeet.programacindecitas.States.FiltroMedicosState
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class FiltroMedicosViewModel(
    private var daoF: FiltroMedicosDatabaseDao
): ViewModel() {
    var state by mutableStateOf(FiltroMedicosState())
    private set

   init{
       viewModelScope.launch {
           daoF.obtenerfiltromedicos().collectLatest {
               state = state.copy(
                   listfiltrado = it,
               )
           }
       }
   }

    fun AgregarFiltroMedico(filtroMedicos: FiltroMedicos) = viewModelScope.launch{
        daoF.agregarfiltromedicos(filtroMedicos = filtroMedicos)
    }
    fun ActualizarFiltroMedico(filtroMedicos: FiltroMedicos) = viewModelScope.launch{
        daoF.actualizarfiltromedicos(filtroMedicos = filtroMedicos)
    }
    fun BorrarFiltroMedico(filtroMedicos: FiltroMedicos) = viewModelScope.launch{
        daoF.borrarfiltromedicos(filtroMedicos = filtroMedicos)
    }

}