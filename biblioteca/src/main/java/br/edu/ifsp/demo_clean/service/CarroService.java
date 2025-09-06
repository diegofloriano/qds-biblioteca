package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;
import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.repository.CarroRepository;
import java.util.*;

@Service
public class CarroService {

    private CarroRepository carroRepository;
    
    public CarroService(CarroRepository carroRepository){
        this.carroRepository = carroRepository; 
    }

    public void addCarro(Carro carro){
    	carroRepository.save(carro);
    }
    
    public List<Carro> listarCarros(){
    	return carroRepository.findAll();
    }

    
}
