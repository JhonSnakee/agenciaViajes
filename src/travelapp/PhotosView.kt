package travelapp

import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.scene.text.Font

class PhotosView {

    fun getPhotosView(): VBox {
        val photosLayout = VBox(10.0)
        photosLayout.padding = Insets(15.0)

        // Ejemplo de imágenes con descripciones
        val image1 = Image("./resources/photosView/medellin1.jpeg")
        val imageView1 = ImageView(image1)
        val description1 = Label("Descripción de la Foto 1")

        val image2 = Image("./resources/photosView/medellin2.jpeg")
        val imageView2 = ImageView(image2)
        val description2 = Label("Descripción de la Foto 2")

        // Estilo de texto
        description1.font = Font.font(14.0)
        description2.font = Font.font(14.0)

        photosLayout.children.addAll(imageView1, description1, imageView2, description2)

        return photosLayout
    }
}
