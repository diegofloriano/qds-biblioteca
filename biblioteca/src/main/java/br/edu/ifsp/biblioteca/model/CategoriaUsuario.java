package br.edu.ifsp.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class CategoriaUsuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoriaUsuario;

    @NotBlank
    private String nomeCategoriaUsuario;
    
    // ====================================================
    //                   getters e setters
    // ====================================================
    
    public int getIdCategoriaUsuario() {
        return idCategoriaUsuario;
    }

    public void setIdCategoriaUsuario(int idCategoriaUsuario) {
        this.idCategoriaUsuario = idCategoriaUsuario;
    }

    public String getNomeCategoriaUsuario() {
        return nomeCategoriaUsuario;
    }

    public void setNomeCategoriaUsuario(String nomeCategoriaUsuario) {
        this.nomeCategoriaUsuario = nomeCategoriaUsuario;
    }
}
