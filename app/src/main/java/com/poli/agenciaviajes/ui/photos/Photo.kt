package com.poli.agenciaviajes.ui.photos

data class Photo(
    val imageUrl: Int,
    val description: String,
    var isDescriptionVisible: Boolean = false
)
