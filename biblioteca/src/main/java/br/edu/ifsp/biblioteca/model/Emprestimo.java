package br.edu.ifsp.biblioteca.model;

import jakarta.persistence.*;

@Entity
public class Emprestimo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idEmprestimo;
}
