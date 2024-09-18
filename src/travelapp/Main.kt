package travelapp

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.stage.Stage

class TravelApp : Application() {

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Agencia de Viajes"

        // Sidebar (barra lateral)
        val sidebar = VBox(10.0)
        sidebar.padding = Insets(10.0)

        // Botones en la barra lateral
        val profileButton = Button("Perfil")
        val photosButton = Button("Fotos")
        val videoButton = Button("Video")
        val webButton = Button("Web")

        // Agregar botones al Sidebar
        sidebar.children.addAll(profileButton, photosButton, videoButton, webButton)

        // Crear un contenedor principal
        val mainLayout = BorderPane()

        // Establecer la barra lateral a la izquierda
        mainLayout.left = sidebar

        // Inicializar con un contenido de bienvenida
        val welcomeMessage = Label("Bienvenido a la Agencia de Viajes")
        mainLayout.center = welcomeMessage

        // Instanciar ProfileView, PhotosView, VideoView, y WebView
        val profileView = ProfileView()
        val photosView = PhotosView()
        val videoView = VideoView()
        val webView = WebView()

        // Acciones para cambiar el contenido
        profileButton.setOnAction {
            mainLayout.center = profileView.getProfileView()  // Cambiar al perfil
        }

        photosButton.setOnAction {
            mainLayout.center = photosView.getPhotosView()  // Cambiar a la vista de fotos
        }

        videoButton.setOnAction {
            //mainLayout.center = videoView.getVideoView()  // Cambiar a la vista de video
        }

        webButton.setOnAction {
            //mainLayout.center = webView.getWebView()  // Cambiar a la vista web
        }

        // Crear la escena y asignarla al stage
        val scene = Scene(mainLayout, 800.0, 600.0)
        primaryStage.scene = scene
        primaryStage.show()
    }
}

// Función main para ejecutar la aplicación
fun main() {
    Application.launch(TravelApp::class.java)
}
