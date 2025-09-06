package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;
import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.service.CarroService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Carro ", description = " ")
public class CarroController {

    private CarroService carroService;

    public CarroController(CarroService carroService){
    	this.carroService = carroService;
    }

    @PostMapping("/carro")
    public String salvaCarro(@RequestBody Carro carro){
    	carroService.addCarro(carro); 
    	return "ok cliente";
    }

    @GetMapping("/carro")
    public List<Carro> listarCarros(){
    	return carroService.listarCarros();
    }    

    
}