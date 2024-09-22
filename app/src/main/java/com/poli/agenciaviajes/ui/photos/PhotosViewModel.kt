package com.poli.agenciaviajes.ui.photos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhotosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Photos Fragment"
    }
    val text: LiveData<String> = _text
}