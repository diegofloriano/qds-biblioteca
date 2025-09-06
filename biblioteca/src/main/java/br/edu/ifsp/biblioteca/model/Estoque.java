package br.edu.ifsp.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idEstoque;

    
}