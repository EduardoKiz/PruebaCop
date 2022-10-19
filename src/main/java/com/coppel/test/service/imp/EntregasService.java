package com.coppel.test.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.Entregas;
import com.coppel.test.repository.EntregasRepository;
import com.coppel.test.service.IEntregasService;

@Service
public class EntregasService implements IEntregasService{

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
