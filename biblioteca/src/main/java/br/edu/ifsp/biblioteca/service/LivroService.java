package br.edu.ifsp.biblioteca.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.biblioteca.model.Livro;
import br.edu.ifsp.biblioteca.repository.LivroRepository;

import java.util.*;

@Service
public class LivroService {
	
	private LivroRepository clienteRepository;
	
	public LivroService(LivroRepository clienteRepository){
        this.clienteRepository = clienteRepository; 
    }
	
	// cliente
    public void addCliente(Livro cliente){
    	clienteRepository.save(cliente);
    }
    
    public List<Livro> listarClientes(){
    	return clienteRepository.findAll();
    }
}
