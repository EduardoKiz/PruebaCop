package com.coppel.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.Entregas;
import com.coppel.test.repository.EntregasRepository;

@Service
public class EntregasService {

	@Autowired EntregasRepository entregasRepository;
	
 
    public Entregas saveEntrega( Entregas ent) { 	
        return  entregasRepository.save(ent);
        
    }
    public List<Entregas> getEntregas( Long idEmpleado, Integer mes,Integer anio) { 	
        return  entregasRepository.findByIdEmpleadoAndMes(idEmpleado,mes,anio);
       
    }
    public List<Entregas> getEntregasAll() { 	
        return  entregasRepository.findAll();
       
    }
}
