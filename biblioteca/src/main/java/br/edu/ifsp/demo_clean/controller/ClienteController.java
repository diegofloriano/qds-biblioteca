package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;
import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.service.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Carro ", description = " ")

public class ClienteController {
	
	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService){
    	this.clienteService = clienteService;
    }

	@PostMapping("/cliente")
    public String salvaCliente(@RequestBody Cliente cliente){
		clienteService.addCliente(cliente);
		return "ok carro";
	}

    @GetMapping("/cliente")
    public List<Cliente> listarClientes(){
    	return clienteService.listarClientes();
    }
	
}
