package com.poli.agenciaviajes.ui.photos
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.poli.agenciaviajes.R

class PhotosViewModel : ViewModel() {

    private val _photos = MutableLiveData<List<Photo>>().apply {
        value = listOf(
            Photo(R.drawable.imgperutrujillo, "Trujillo, conocida como la 'Ciudad de la Eterna Primavera', es famosa por su clima agradable y sus festivales coloridos. La ciudad también es un testimonio vivo de la historia precolombina y colonial de Perú, como se ve en sus bien conservadas estructuras y sitios arqueológicos."),
            Photo(R.drawable.imgmoscu, "La Catedral de San Basilio en la Plaza Roja de Moscú, con sus coloridas cúpulas en forma de bulbo, es uno de los símbolos más reconocidos de Rusia. Este lugar histórico refleja la rica tradición y el esplendor arquitectónico del país."),
            Photo(R.drawable.imgiorreeiffel, "La Torre Eiffel, situada en el corazón de París, no solo es una maravilla de la ingeniería, sino también un símbolo de amor y arte. Desde su construcción, ha capturado la imaginación de millones, ofreciendo vistas inigualables de la ciudad luz."),
            Photo(R.drawable.imgmexicociudad, "El Palacio de Bellas Artes en Ciudad de México, un ícono de la arquitectura y cultura mexicana. Este majestuoso edificio no solo es un centro para las artes, sino también un punto de encuentro para los apasionados de la historia y la arquitectura."),
            Photo(R.drawable.imgecuadorloja, "Loja, la ciudad musical de Ecuador, destaca por su rica historia cultural y su vibrante escena artística. Esta vista captura el esplendor arquitectónico y la belleza paisajística que hacen de Loja un destino encantador para los visitantes de todo el mundo.")
        )
    }
    val photos: LiveData<List<Photo>> = _photos

    // Mensaje de bienvenida u otros textos si es necesario
    private val _text = MutableLiveData<String>().apply {
        value = "This is Photos Fragment"
    }
    val text: LiveData<String> = _text
}
