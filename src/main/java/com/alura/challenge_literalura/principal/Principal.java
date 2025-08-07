package com.alura.challenge_literalura.principal;

import com.alura.challenge_literalura.model.Datos;
import com.alura.challenge_literalura.model.DatosLibros;
import com.alura.challenge_literalura.service.ConsumoAPI;
import com.alura.challenge_literalura.service.ConvierteDatos;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

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
                    getDatos();
                case 2:
                    //buscarEpisodioPorSerie();
                    break;
                case 3:
                    //mostrarSeriesBuscadas();
                    break;
                case 4:
                    //buscarSeriesPorTitulo();
                    break;
                case 5:
                    //buscarTop5Series();
                    break;
                case 6:
                    //buscarSeriesPorCategoria();
                    break;
                case 7:
                    //filtrarSeriesPorTemporadaYEvaluacion();
                    break;
                case 8:
                    //buscarEpisodiosPorTitulo();
                    break;
                case 9:
                    //buscarTop5Episodios();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private Datos getDatos() {
        System.out.println("Escribe el nombre del libro que deseas buscar");
        var tituloLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + tituloLibro.replace(" ", "+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();
        if(libroBuscado.isPresent()) {
            System.out.println("----- LIBRO -----");
            System.out.println("Título: " + libroBuscado.get().titulo());
            System.out.println("Autor: " + libroBuscado.get().autor().stream().findFirst().get().nombre());
            System.out.println("Idioma: " + libroBuscado.get().idiomas().stream().findFirst().orElse("Sin idiomas"));
            System.out.println("Número de Descargas: " + libroBuscado.get().numeroDeDescargas());
            System.out.println("-----------------");
        } else {
            System.out.println("Libro no encontrado");
        }
        return null;
    }
}
