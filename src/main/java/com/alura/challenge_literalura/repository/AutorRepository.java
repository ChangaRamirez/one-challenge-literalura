package com.alura.challenge_literalura.repository;

import com.alura.challenge_literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
