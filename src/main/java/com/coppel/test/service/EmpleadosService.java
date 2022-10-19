package com.coppel.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.Empleado;
import com.coppel.test.repository.EmpleadoRepository;

@Service
public class EmpleadosService {
	
@Autowired EmpleadoRepository empleadoRepositroy;
	
	public List<Empleado> findAllEmpleados() {
		
		return empleadoRepositroy.findAll();
    }

    public Empleado findById( Long id) {
    	Optional<Empleado> emp=empleadoRepositroy.findById(id);
        return emp.isEmpty()?null:emp.get();       
    }
    
    public Empleado saveEmpleado(Empleado emp) {
    	System.out.println("ENTRAMOS..");
    	return  empleadoRepositroy.save(emp); 
    }
	
}
