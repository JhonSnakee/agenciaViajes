package travelapp

//import javafx.geometry.Insets
//import javafx.scene.control.Button
//import javafx.scene.control.TextField
//import javafx.scene.layout.BorderPane
//import javafx.scene.layout.VBox
//import javafx.scene.web.WebEngine
//import javafx.scene.web.WebView

class WebView {

//    fun getWebView(): BorderPane {
//        // Crear un WebView para mostrar la página web
//        val webView = WebView()
//        val webEngine = webView.engine
//
//        // Crear un TextField para ingresar la URL
//        val urlField = TextField()
//        urlField.promptText = "Ingresa la URL aquí"
//
//        // Crear un botón para cargar la página web
//        val goButton = Button("Ir")
//        goButton.setOnAction {
//            val url = urlField.text
//            if (url.isNotBlank()) {
//                webEngine.load(url)
//            }
//        }
//
//        // Crear un layout para los controles
//        val controlsLayout = VBox(10.0)
//        controlsLayout.padding = Insets(15.0)
//        controlsLayout.children.addAll(urlField, goButton)
//
//        // Crear el layout principal
//        val webLayout = BorderPane()
//        webLayout.top = controlsLayout
//        webLayout.center = webView
//
//        return webLayout
//    }
}
