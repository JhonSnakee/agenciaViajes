package travelapp

//import javafx.geometry.Insets
//import javafx.scene.control.Button
//import javafx.scene.control.Slider
//import javafx.scene.control.ToolBar
//import javafx.scene.layout.VBox
//import javafx.scene.media.Media
//import javafx.scene.media.MediaPlayer
//import javafx.scene.media.MediaView

class VideoView {

//    fun getVideoView(): VBox {
//        // Ruta del archivo de video (asegúrate de que la ruta sea correcta)
//        val videoPath = "file:resources/sample-video.mp4"
//        val media = Media(videoPath)
//        val mediaPlayer = MediaPlayer(media)
//        val mediaView = MediaView(mediaPlayer)
//
//        // Controles de reproducción
//        val playButton = Button("Play")
//        val pauseButton = Button("Pause")
//        val stopButton = Button("Stop")
//        val volumeSlider = Slider(0.0, 1.0, 0.5)
//
//        // Configurar el control de volumen
//        mediaPlayer.volume = volumeSlider.value
//        volumeSlider.valueProperty().addListener { _, _, newValue ->
//            mediaPlayer.volume = newValue.toDouble()
//        }
//
//        // Botones de control
//        playButton.setOnAction {
//            mediaPlayer.play()
//        }
//        pauseButton.setOnAction {
//            mediaPlayer.pause()
//        }
//        stopButton.setOnAction {
//            mediaPlayer.stop()
//        }
//
//        // Barra de herramientas para controles de video
//        val toolBar = ToolBar(playButton, pauseButton, stopButton, volumeSlider)
//
//        // Crear el layout principal
//        val videoLayout = VBox(10.0)
//        videoLayout.padding = Insets(15.0)
//        videoLayout.children.addAll(toolBar, mediaView)
//
//        return videoLayout
//    }
}
