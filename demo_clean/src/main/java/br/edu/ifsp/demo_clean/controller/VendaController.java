package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;
import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.service.VendaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Venda ", description = " ")

public class VendaController {
	
	private VendaService vendaService;
	
	public VendaController(VendaService vendaService){
    	this.vendaService = vendaService;
    }
	
	@PostMapping("/venda")
    public String salvaVenda(@RequestBody Venda venda){
		vendaService.addVenda(venda); 
		return "ok venda";
	}

    @GetMapping("/venda")
    public List<Venda> listarVendas(){
    	return vendaService.listarVendas();
    }
	
}
