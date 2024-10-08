package com.poli.agenciaviajes.ui.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeViewModel : ViewModel() {

    // MutableLiveData para el texto de bienvenida
    private val _text = MutableLiveData<String>().apply {
        value = "¡Bienvenido a nuestra aplicación Angencia de viajes!"
    }
    val text: LiveData<String> = _text
}
