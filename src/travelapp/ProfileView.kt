package travelapp

import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.text.Font

class ProfileView {

    fun getProfileView(): VBox {
        val profileLayout = VBox(10.0)
        profileLayout.padding = Insets(15.0)

        // Ejemplo de información del perfil
        val nameLabel = Label("Nombre: Juan Pérez")
        val educationLabel = Label("Educación: Ingeniero en Sistemas")
        val experienceLabel = Label("Experiencia: 5 años en desarrollo de software")

        // Estilo de texto
        nameLabel.font = Font.font(20.0)
        educationLabel.font = Font.font(16.0)
        experienceLabel.font = Font.font(16.0)

        profileLayout.children.addAll(nameLabel, educationLabel, experienceLabel)

        return profileLayout
    }
}
