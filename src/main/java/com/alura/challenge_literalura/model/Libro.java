package com.alura.challenge_literalura.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "libros_autores",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private List<Autor> autor;
    private String idioma;
    private Double numeroDeDescargas;

    public Libro() {}

    public Libro(DatosLibros datos) {
        this.titulo = datos.titulo();
        this.idioma = datos.idioma().stream().findFirst().orElse("Sin idioma");
        this.numeroDeDescargas = datos.numeroDeDescargas();

        this.autor = datos.autor().stream()
                .map(dato -> new Autor(dato))
                .toList();

        this.autor.forEach(a -> {
            if (a.getLibros() == null) {
                a.setLibros(new ArrayList<>());
            }
            a.getLibros().add(this); // Añade este libro a la lista de libros del autor
        });
    }

    @Override
    public String toString() {
        String nombresAutores = autor.stream()
                .map(Autor::getNombre)
                .collect(Collectors.joining(", "));
        return "-----  LIBRO  -----" + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + nombresAutores + "\n" +
                "Idioma: " + idioma + "\n" +
                "Número de Descargas: " + numeroDeDescargas + "\n" +
                "------------------";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getNumeroDeDescargas() {
        return numeroDeDescargas;
    }

    public void setNumeroDeDescargas(Double numeroDeDescargas) {
        this.numeroDeDescargas = numeroDeDescargas;
    }
}
