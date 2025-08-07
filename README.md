<!-- Improved compatibility of regresar al inicio link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![project_license][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/ChangaRamirez/challenge-literalura">
    <img src="https://github.com/ChangaRamirez/one-challenge-literalura/blob/main/assets/images/literalura-logo.png" alt="Logo" width="300" height="120">
  </a>

<h3 align="center">Literalura</h3>

  <p align="center">
    Buscador de libros desde el catálogo de Gutendex, con funcionalidades de filtrado, guardado y consulta por idioma o autor.
    <br />
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto"><strong>Explora los documentos »</strong></a>
    <br />
    <br />
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto">Ver Demo</a>
    &middot;
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues/new?labels=bug&template=bug-report.md">Reportar Un Bug</a>
    &middot;
    <a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues/new?labels=enhancement&template=feature-request.md">Solicitar Una Funcionalidad</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenidos</summary>
  <ol>
    <li>
      <a href="#about-the-project">Acerca Del Proyecto</a>
      <ul>
        <li><a href="#built-with">Creado Con</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Empezando</a>
      <ul>
        <li><a href="#prerequisites">Prerequisitos</a></li>
        <li><a href="#installation">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#usage">Uso</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contribuyendo</a></li>
    <li><a href="#license">Licencia</a></li>
    <li><a href="#contact">Contacto</a></li>
    <li><a href="#acknowledgments">Reconocimientos</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Acerca Del Proyecto

<img src="https://github.com/ChangaRamirez/one-challenge-literalura/blob/main/assets/images/literalura-logo-transp.png" alt="Logo" width="500">

<!--Here's a blank template to get started. To avoid retyping too much info, do a search and replace with your text editor for the following: `ChangaRamirez`, `one-challenge-amigo-secreto`, `twitter_handle`, `linkedin_username`, `hotmail`, `laloraco`, `project_title`, `project_description`, `project_license`-->

### ¡Bienvenidos al catálogo literario más geek de la historia!

Este proyecto nació de la brillante idea de combinar el poder de Java con la vasta biblioteca del Proyecto Gutenberg (a través de la API de Gutendex) para crear una herramienta que todo amante de los libros —y del código limpio— sabrá apreciar. 📚✨

Aquí, nada de buscar manualmente entre miles de títulos. Con esta aplicación de consola podrás buscar libros por título, guardar tus favoritos, listar autores, filtrar por idioma y hasta consultar qué escritores seguían vivos en un año específico. Todo esto, mientras aprendes a trabajar con APIs, colecciones, estructuras de datos y persistencia en base de datos usando Spring Boot y JPA. Un viaje técnico y literario.

Ideal para proyectos de práctica, amantes del código organizado o simplemente para quienes quieren llevar un control digital de lo que descubren en el dominio público. Así que, ¿listo para sumergirte en el mundo de la literatura… con PostgreSQL y Java de tu lado? 🖥️📖

![A Cool Gif](https://i.pinimg.com/originals/81/22/df/8122df968ad014a2cc8dcb9552bfdb02.gif)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



### Creado con

* [![Java][Java]][Java-url]
* [![PostgreSQL][PostgreSQL]][PostgreSQL-url]
* [![SpringBoot][SpringBoot]][SpringBoot-url]
<!--* [![Next][Next.js]][Next-url]
* [![React][React.js]][React-url]
* [![Vue][Vue.js]][Vue-url]
* [![Angular][Angular.io]][Angular-url]
* [![Svelte][Svelte.dev]][Svelte-url]
* [![Laravel][Laravel.com]][Laravel-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]
* [![JQuery][JQuery.com]][JQuery-url]-->

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>

<!-- GETTING STARTED -->
## Empezando

Aquí van las instrucciones para poder visualizar el proyecto, ya sea desde un navegador web o si se desea, localmente desde tu computadora.
Para conseguir una copia local solo hay que seguir unos sencillos pasos.

### Prerequisitos

Al ser una aplicación de consola con persistencia en base de datos, necesitarás tener configurado un entorno mínimo de desarrollo en Java. Yo utilicé Java 17, IntelliJ IDEA como editor, y una instancia local de PostgreSQL para guardar los datos.

Dicho eso, si solo quieres explorar el código, puedes revisar los archivos directamente desde este repositorio aquí en GitHub. No necesitas compilar nada para ver cómo está estructurado el proyecto. =)

### Instalación

1. Clonar el repositorio
   ```sh
   git clone https://github.com/ChangaRamirez/one-challenge-literalura.git
   ```
5. Cambiar el git remote url para evitar pushes accidentales al proyecto base
   ```sh
   git remote set-url origin ChangaRamirez/one-challenge-literalura
   git remote -v # confirmar los cambios
   ```
<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- USAGE EXAMPLES -->
## Uso

<div align=center><img src="assets/gifs/demo.gif" alt="Logo" width="500"></div>

 Este proyecto puede ser tu nuevo compañero en la exploración del vasto universo literario de dominio público. Ya sea que quieras encontrar clásicos por título, ver qué autores estaban vivos en determinado año, o simplemente guardar tus descubrimientos en una base de datos, esta herramienta lo hace fácil y divertido desde la consola.

Aquí te dejo algunas maneras de sacarle provecho a la app:

### Buscar libros por título
¿Tienes curiosidad por leer "Frankenstein", "Hamlet" o "La guerra de los mundos"? Solo ingresa el título (o parte de él) y el programa buscará resultados usando la API de Gutendex. Podrás ver los detalles del libro y guardarlo en tu catálogo local con un solo enter.

### Consultar autores registrados
Una vez que guardes algunos libros, podrás listar todos los autores guardados hasta ahora. La app te mostrará su nombre, fechas de nacimiento y fallecimiento, y los libros asociados que has buscado.

### Ver autores vivos en un año específico
¿Te interesa saber quiénes estaban vivos en el año 1850? Esta opción te permite ingresar un año y ver todos los autores que estaban activos en ese momento, con base en los datos disponibles en el API.

## Filtrar libros por idioma
¿Solo quieres ver libros en inglés? ¿O explorar autores de literatura francesa o portuguesa? Puedes filtrar todos los libros guardados por código de idioma (por ejemplo: en, es, fr, pt) y explorar los resultados de forma ordenada.

### Borrar todos los registros
Si quieres reiniciar tu catálogo y comenzar desde cero, puedes usar la opción para eliminar todos los libros y autores guardados en la base de datos con un solo comando. ¡Cuidado! Esta acción es irreversible.

Ya estás listo para comenzar tu viaje entre autores y libros, con una herramienta hecha en Java, impulsada por Spring Boot, y respaldada por PostgreSQL. Todo desde tu terminal favorita. 📚💻

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- ROADMAP -->
## Roadmap

Este proyecto fue desarrollado paso a paso, integrando nuevas funcionalidades con cada iteración, hasta convertirse en una herramienta completa para explorar y guardar libros desde el catálogo de Gutendex. A continuación, se detallan las etapas clave del desarrollo:

### ✅ 1. Conexión con la API de Gutendex
El primer paso fue investigar cómo funciona la API pública de Gutendex, entender su estructura y definir los endpoints necesarios para realizar búsquedas de libros.

### ✅ 2. Construcción de la solicitud HTTP
Se desarrolló una clase encargada de enviar peticiones GET a la API usando HttpClient, obteniendo así las respuestas en formato JSON de manera dinámica.

### ✅ 3. Análisis y mapeo del JSON de respuesta
Se utilizó la biblioteca Jackson para interpretar las respuestas JSON y convertirlas en registros (record) Java. Esto permitió un manejo limpio y seguro de los datos recibidos.

### ✅ 4. Conversión de los datos a entidades Java
A partir de los DTOs (DatosLibros, DatosAutor), se construyeron las entidades persistentes Libro y Autor, mapeadas con JPA para su almacenamiento en base de datos.

### ✅ 5. Interacción con el usuario por consola
Se implementó una interfaz interactiva en consola para que el usuario pudiera buscar libros, visualizar datos y navegar entre las distintas opciones del menú.

### ✅ 6. Consulta y guardado de libros
Se agregó la funcionalidad principal de búsqueda de libros por título, mostrando resultados relevantes y permitiendo guardar selecciones en la base de datos.

### ✅ 7. Consulta de autores
Se desarrollaron opciones adicionales para listar todos los autores registrados, incluyendo sus fechas de nacimiento, fallecimiento y libros relacionados.

### ✅ 8. Persistencia de datos con PostgreSQL
Se conectó la aplicación a una base de datos PostgreSQL usando Spring Data JPA, permitiendo almacenar libros y autores de manera relacional y permanente.

### ✅ 9. Filtrado de resultados por idioma y por año de vida de los autores
Se añadieron filtros personalizados que permiten explorar los libros guardados por idioma, y listar autores que estuvieron vivos en un año determinado.

Este roadmap refleja el crecimiento del proyecto desde sus cimientos hasta convertirse en una herramienta funcional para gestionar un pequeño catálogo literario personalizado. 📖
Y como todo buen proyecto... ¡esto apenas comienza! 🚀

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- CONTRIBUTING -->
## Contribuyendo

Las contribuciones son lo que hace que la comunidad de código abierto sea un lugar tan increíble para aprender, inspirar y crear. Cualquier contribución que hagas será **muy apreciada**.

Si tienes una sugerencia que pueda mejorar esto, por favor haz un fork del repositorio y crea un pull request. También puedes abrir un issue con la etiqueta "enhancement" (mejora). ¡No olvides darle una estrella al proyecto! ¡Gracias nuevamente!

1. Haz un fork del proyecto
2. Crea tu rama de características (git checkout -b feature/AmazingFeature)
3. Haz commit de tus cambios (git commit -m 'Añadir una AmazingFeature')
4. Sube a la rama (git push origin feature/AmazingFeature)
5. Abre un pull request

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>

### Top contribuyentes:

<a href="https://github.com/ChangaRamirez/one-challenge-amigo-secreto/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=ChangaRamirez/one-challenge-amigo-secreto" alt="contrib.rocks image" />
</a>



<!-- LICENSE -->
## Licencia

Este proyecto es para uso personal y educativo exclusivamente. El uso comercial no está autorizado. Puedes leer más en [LICENCE.txt](LICENCE.txt)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- CONTACT -->
## Contacto

Eduardo "Changa" Ramírez-García - laloraco@hotmail.com

Link del Proyecto: [https://github.com/ChangaRamirez/one-challenge-amigo-secreto](https://github.com/ChangaRamirez/one-challenge-amigo-secreto)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Reconocimientos

* [Alura LATAM](https://www.aluracursos.com/)
* [ONE - Oracle Next Education](https://www.oracle.com/mx/education/oracle-next-education/)
* [Othneil Drew (tu plantilla README.md me salvó)](https://github.com/othneildrew)

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[contributors-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[forks-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/network/members
[stars-shield]: https://img.shields.io/github/stars/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[stars-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/stargazers
[issues-shield]: https://img.shields.io/github/issues/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[issues-url]: https://github.com/ChangaRamirez/one-challenge-amigo-secreto/issues
[license-shield]: https://img.shields.io/github/license/ChangaRamirez/one-challenge-amigo-secreto.svg?style=for-the-badge
[license-url]: https://raw.githubusercontent.com/ChangaRamirez/one-challenge-amigo-secreto/refs/heads/main/LICENCE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ramirezpaints/
[product-screenshot]: images/screenshot.png
[JavaScript]: https://shields.io/badge/JavaScript-F7DF1E?logo=JavaScript&logoColor=000&style=flat-square
[JavaScript-url]: https://www.javascript.com/
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/es/
[PostgreSQL]: https://img.shields.io/badge/postgresql-4169e1?style=for-the-badge&logo=postgresql&logoColor=white
[PostgreSQL-url]: https://www.postgresql.org/
[SpringBoot]: https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white
[SpringBoot-url]: https://spring.io/
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
