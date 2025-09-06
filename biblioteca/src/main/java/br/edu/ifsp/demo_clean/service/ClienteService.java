package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;
import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.repository.ClienteRepository;
import java.util.*;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository; 
    }
	
	// cliente
    public void addCliente(Cliente cliente){
    	clienteRepository.save(cliente);
    }
    
    public List<Cliente> listarClientes(){
    	return clienteRepository.findAll();
    }
}
