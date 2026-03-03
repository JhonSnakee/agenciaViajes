# ✈️ Agencia de Viajes — App Android

Aplicación Android desarrollada como proyecto universitario para la materia de **Desarrollo Móvil**. Simula una agencia de viajes con múltiples secciones interactivas: bienvenida, perfil de usuario, galería de destinos, videos de ciudades colombianas, navegador web integrado y ajustes.

---

## 👥 Integrantes

| Nombre |
|---|
| Jhon Alejandro Murillo Diaz |
| Daniel Orlando Espinosa Recaman |
| Johnatan Yair Bautista Gonzalez |
| Carlos Yecid Ascencio Cely |
| Yonathan Molina C. |

> **Grupo:** MovB01 — Grupo 14

---

## 📱 Capturas de pantalla

> *(Agregar capturas de pantalla de la app aquí)*

---

## 🚀 Características

| Sección | Descripción |
|---|---|
| 🏠 **Welcome** | Pantalla de bienvenida con animación Lottie y botón para comenzar |
| 👤 **Profile** | Perfil de usuario con información personal, bio y redes sociales con animaciones Lottie |
| 🖼️ **Photos** | Galería de destinos turísticos internacionales con descripción expandible al hacer clic |
| 🎬 **Video** | Reproductor de videos de ciudades colombianas (Bogotá, Medellín, Cartagena) |
| 🌐 **Web** | Navegador web integrado con barra de búsqueda personalizada |
| ⚙️ **Settings** | Pantalla de ajustes de la aplicación |

---

## 🗺️ Destinos incluidos

- 🇵🇪 **Trujillo, Perú** — La Ciudad de la Eterna Primavera
- 🇷🇺 **Moscú, Rusia** — Catedral de San Basilio en la Plaza Roja
- 🇫🇷 **París, Francia** — La Torre Eiffel
- 🇲🇽 **Ciudad de México** — El Palacio de Bellas Artes
- 🇪🇨 **Loja, Ecuador** — La ciudad musical del Ecuador

---

## 🛠️ Tecnologías y dependencias

| Librería | Versión | Uso |
|---|---|---|
| Kotlin | — | Lenguaje principal |
| Android Jetpack Navigation | 2.6.0 | Navegación entre fragmentos con Navigation Drawer |
| ViewModel + LiveData | 2.6.1 | Arquitectura MVVM |
| ViewBinding / DataBinding | — | Enlace de vistas |
| Lottie | 4.2.2 | Animaciones JSON en bienvenida y perfil |
| Picasso | 2.71828 | Carga y caché de imágenes |
| Material Design | 1.9.0 | Componentes de UI |
| ConstraintLayout | 2.1.4 | Layouts responsivos |

---

## 🏗️ Arquitectura

El proyecto sigue el patrón **MVVM (Model - View - ViewModel)**:

```
com.poli.agenciaviajes
├── MainActivity.kt          # Actividad principal con Navigation Drawer
└── ui/
    ├── welcome/             # Pantalla de bienvenida
    ├── profile/             # Perfil de usuario
    ├── photos/              # Galería de destinos (RecyclerView)
    │   ├── Photo.kt         # Modelo de datos
    │   ├── PhotosAdapter.kt # Adapter del RecyclerView
    │   ├── PhotosFragment.kt
    │   └── PhotosViewModel.kt
    ├── video/               # Reproductor de videos
    ├── web/                 # WebView con barra de búsqueda
    └── settings/            # Pantalla de ajustes
```

---

## ⚙️ Configuración del proyecto

| Parámetro | Valor |
|---|---|
| `applicationId` | `com.poli.agenciaviajes` |
| `minSdk` | 28 (Android 9 Pie) |
| `targetSdk` | 34 (Android 14) |
| `compileSdk` | 34 |
| `versionName` | 1.0 |

---

## 📦 Instalación y ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/agenciaViajes.git
   ```

2. **Abrir en Android Studio** (versión Hedgehog o superior recomendada).

3. **Sincronizar Gradle** — Android Studio lo hará automáticamente al abrir el proyecto.

4. **Ejecutar** en un dispositivo o emulador con **Android 9 (API 28) o superior**.

---

## 📂 Recursos multimedia

- **Imágenes:** destinos internacionales en formato `.webp`
- **Videos:** ciudades colombianas (`bogota_vid.mp4`, `medellin_vid.mp4`, `cartagena_vid.mp4`) almacenados en `res/raw/`
- **Animaciones Lottie:** íconos de redes sociales y pantalla de bienvenida en `res/raw/`
- **Fuentes:** familia tipográfica *Poppins* (Regular, Medium, Bold) en `res/font/`

---

## 👤 Autor

> Desarrollado con cariño por [@JhonSnakee](https://github.com/JhonSnakee)