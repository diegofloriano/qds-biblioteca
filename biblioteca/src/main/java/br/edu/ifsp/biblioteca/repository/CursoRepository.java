package br.edu.ifsp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifsp.biblioteca.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
}