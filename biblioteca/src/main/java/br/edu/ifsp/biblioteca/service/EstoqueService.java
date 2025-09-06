package br.edu.ifsp.biblioteca.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.biblioteca.model.Estoque;
import br.edu.ifsp.biblioteca.repository.EmprestimoRepository;

import java.util.*;

@Service
public class EstoqueService {
	
	private EmprestimoRepository vendaRepository;
	
	public EstoqueService(EmprestimoRepository vendaRepository){
        this.vendaRepository = vendaRepository;
    }
	
	// venda
    public void addVenda(Estoque venda){
    	vendaRepository.save(venda);
    }
    
    public List<Estoque> listarVendas(){
    	return vendaRepository.findAll();
    }
}
