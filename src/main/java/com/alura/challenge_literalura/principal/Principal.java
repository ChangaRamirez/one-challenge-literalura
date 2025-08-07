package com.alura.challenge_literalura.principal;

import com.alura.challenge_literalura.model.Datos;
import com.alura.challenge_literalura.model.DatosLibros;
import com.alura.challenge_literalura.model.Libro;
import com.alura.challenge_literalura.repository.AutorRepository;
import com.alura.challenge_literalura.repository.LibroRepository;
import com.alura.challenge_literalura.service.ConsumoAPI;
import com.alura.challenge_literalura.service.ConvierteDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private LibroRepository repositorio;
    private final AutorRepository autorRepositorio;

    @Autowired
    public Principal(LibroRepository repositorio, AutorRepository autorRepositorio) {
        this.repositorio = repositorio;
        this.autorRepositorio = autorRepositorio;
    }

    public void muestraElMenu() {
//        var json = consumoAPI.obtenerDatos(URL_BASE);
//        System.out.println(json);
//        var datos = conversor.obtenerDatos(json, Datos.class);
//        System.out.println(datos);

        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    Elija la opción a través de su número:
                    1 - Buscar libro por título
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibro();
                    break;
                case 2:
                    listarLibros();
                    break;
                case 3:
                    listarAutores();
                    break;
                case 4:
                    listarAutoresVivosEnAnio();
                    break;
                case 5:
                    listarLibrosPorIdioma();
                    break;
                case 6:
                    borrarRegistros();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private DatosLibros getDatos() {
        System.out.println("Escribe el nombre del libro que deseas buscar");
        var tituloLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + tituloLibro.replace(" ", "+"));
        Datos datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();
        if(libroBuscado.isPresent()) {
            return libroBuscado.get();
        } else {
            System.out.println("No se encontraron libros para esa búsqueda.");
        }
        return null;
    }

    private void buscarLibro() {
        DatosLibros datos = getDatos();
        if (datos == null) return;

        Optional<Libro> existente = repositorio.findByTitulo(datos.titulo());
        if (existente.isPresent()) {
            System.out.println("Ese libro ya está guardado.");
            return;
        }

        Libro libro = new Libro(datos);
        repositorio.save(libro);
        System.out.println("Libro guardado");
        System.out.println(libro);
    }

    private void listarLibros() {
        List<Libro> libros = repositorio.findAll();
        if (libros.isEmpty()) {
            System.out.println("No hay libros guardados.");
        } else {
            libros.forEach(System.out::println);
        }
    }

    private void listarAutores() {
        var autores = autorRepositorio.findAll();
        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados.");
        } else {
            System.out.println("----- AUTORES -----");
            autores.forEach(a -> {
                System.out.println("Nombre: " + a.getNombre());
                System.out.println("Nacimiento: " + a.getFechaDeNacimiento());
                System.out.println("Fallecimiento: " + a.getFechaDeFallecimiento());

                String libros = (a.getLibros() != null && !a.getLibros().isEmpty())
                        ? a.getLibros().stream().map(l -> l.getTitulo()).collect(Collectors.joining(", "))
                        : "Sin libros registrados";

                System.out.println("Libros: " + libros);
                System.out.println("-------------------");
            });
        }
    }

    private void listarAutoresVivosEnAnio() {
        System.out.println("Ingresa el año:");
        int anio = teclado.nextInt();
        teclado.nextLine();

        var autores = autorRepositorio.findAll();
        var autoresVivos = autores.stream()
                .filter(a -> {
                    try {
                        int nacimiento = Integer.parseInt(a.getFechaDeNacimiento());
                        String fallecimientoStr = a.getFechaDeFallecimiento();

                        boolean sigueVivo = fallecimientoStr == null || fallecimientoStr.isBlank();
                        boolean murioDespues = !sigueVivo && Integer.parseInt(fallecimientoStr) >= anio;

                        return nacimiento <= anio && (sigueVivo || murioDespues);
                    } catch (NumberFormatException e) {
                        return false; // Ignorar si las fechas no son válidas
                    }
                })
                .toList();

        if (autoresVivos.isEmpty()) {
            System.out.println("No se encontraron autores vivos en ese año.");
        } else {
            System.out.println("----- AUTORES VIVOS EN " + anio + " -----");
            autoresVivos.forEach(a -> {
                System.out.println("Nombre: " + a.getNombre());
                System.out.println("Nacimiento: " + a.getFechaDeNacimiento());
                System.out.println("Fallecimiento: " + a.getFechaDeFallecimiento());
                System.out.println("------------------------");
            });
        }
    }

    private void listarLibrosPorIdioma() {
        System.out.println("Ingresa el código del idioma (por ejemplo: en, es, fr, pt):");
        Set<String> idiomas = repositorio.findAll().stream()
                .map(Libro::getIdioma)
                .filter(i -> i != null && !i.isBlank())
                .collect(Collectors.toSet());

        System.out.println("Idiomas disponibles: " + String.join(", ", idiomas));
        String idioma = teclado.nextLine().trim().toLowerCase();

        var libros = repositorio.findAll().stream()
                .filter(l -> l.getIdioma().equalsIgnoreCase(idioma))
                .toList();

        if (libros.isEmpty()) {
            System.out.println("No se encontraron libros en el idioma: " + idioma);
        } else {
            System.out.println("----- LIBROS EN IDIOMA '" + idioma + "' -----");
            libros.forEach(libro -> {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Idioma: " + libro.getIdioma());
                System.out.println("Descargas: " + libro.getNumeroDeDescargas());
                System.out.println("----------------------------");
            });
        }
    }

    private void borrarRegistros() {
        repositorio.deleteAll();
        autorRepositorio.deleteAll();
        System.out.println("Todos los registros han sido borrados.");
    }
}
