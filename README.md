FilmingApp es una aplicación Android desarrollada como práctica del Tema 6 – PMDM (Curso 2025-2026).
Permite explorar catálogos de películas y series, visualizar detalles completos y ver imágenes a pantalla completa, reforzando la navegación mediante fragments y activities.

Fase 1: Planificación y Estrategia

Objetivo Principal: Practicar listas dinámicas, navegación entre fragments y paso de datos entre activities.

-Mapa de Navegación:
-Inicio / MainActivity
-Películas
-Series
-DetalleActivity
-ImagenCompletaActivity
-Diagrama de Flujo: Recorrido del usuario desde la selección de un elemento hasta la visualización de su detalle y la imagen a pantalla completa.
-Auditoría de Contenidos: Organización de textos (strings.xml) y control de colores y estilos (colors.xml, styles.xml).

Fase 2: Diseño de Bocetos (Usabilidad)

-Fragmentos Películas y Series: tarjetas con imagen + título, scroll vertical.
-DetalleActivity: información completa (título, imagen, reparto, sinopsis, RatingBar).
-ImagenCompletaActivity: visualización de imagen a pantalla completa, cierre al pulsar.
-Toolbar: flecha de regreso y menú lateral.

Fase 3: Ejecución Técnica

Lenguajes: Java (lógica de la app) + Groovy (scripts de Gradle)
-Entorno: Android Studio
-API: 24 (Android 7.0 Nougat)
-Diseño de Interfaz: XML + CardView + RatingBar
-Navegación: Navigation Component + Intents para pasar datos entre activities
-Recursos Visuales: iconos vectoriales y estilos personalizados

 Características del Proyecto

-Navegación intuitiva: Toolbar + Navigation Drawer
-Listas dinámicas: Fragmentos con scroll para películas y series
-Detalle enriquecido: título, imagen, sinopsis, reparto y RatingBar
-Imagen a pantalla completa: visualización interactiva
-Diseño personalizado: paleta azul celeste / azul oscuro, texto justificado, icono vectorial propio

Instalación

1. Clonar el repositorio:

git clone https://github.com/ManuelCastro-Peinado/FilmingApp.git

2. Abrir en Android Studio
3. Ejecutar en emulador o dispositivo
