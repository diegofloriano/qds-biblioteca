package br.edu.ifsp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Integer>{}
