package br.edu.ifsp.biblioteca.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idLivro;

    
}
