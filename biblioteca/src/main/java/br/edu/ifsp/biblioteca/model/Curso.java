package br.edu.ifsp.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Curso {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    
    @NotBlank
    private String nomeCurso;
    
    // ====================================================
    //                   getters e setters
    // ====================================================
    
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
