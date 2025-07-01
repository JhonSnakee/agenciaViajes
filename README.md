# Agencia de Viajes - App Android

Aplicación móvil desarrollada en **Kotlin** para Android que simula una experiencia digital de una agencia de viajes. Incluye navegación entre diferentes secciones como galería de fotos, videos promocionales, perfil de usuario, configuraciones y un visor web embebido.

## 🚀 Características

- Arquitectura **MVVM** (Model-View-ViewModel)
- Navegación basada en **Fragments**
- **Galería de fotos** de destinos turísticos
- **Reproductor de video** embebido
- Sección de **perfil de usuario**
- Sección de **configuración**
- Integración de **navegador web**
- Proyecto modular con buenas prácticas de Android

## 📂 Estructura

```
app/
├── src/
│ ├── main/
│ │ ├── java/com/poli/agenciaviajes/
│ │ │ ├── MainActivity.kt
│ │ │ └── ui/
│ │ │ ├── photos/
│ │ │ ├── profile/
│ │ │ ├── settings/
│ │ │ ├── video/
│ │ │ ├── web/
│ │ │ └── welcome/
│ └── test/ y androidTest/
```


## 🛠️ Requisitos

- Android Studio Giraffe o superior
- Kotlin 1.8+
- SDK mínimo: API 24 (Android 7.0)
- Gradle con configuración Kotlin DSL

## ▶️ Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/agencia-viajes-app.git
2. Abre el proyecto en Android Studio.
3. Sincroniza dependencias y ejecuta en un emulador o dispositivo físico.

## 🧪 Pruebas

Incluye pruebas instrumentadas y unitarias básicas en:
- androidTest/java/com/poli/agenciaviajes/
- test/java/com/poli/agenciaviajes/

## 📌 Licencia

Este proyecto es solo para fines académicos o demostrativos.

## 👤 Autor
> Desarrollado con cariño por [@JhonSnakee](https://github.com/JhonSnakee).
