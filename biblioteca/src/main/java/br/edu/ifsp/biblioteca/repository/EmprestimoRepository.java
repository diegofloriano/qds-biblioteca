package br.edu.ifsp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.biblioteca.model.Estoque;

public interface EmprestimoRepository extends JpaRepository<Estoque,Integer>{}
