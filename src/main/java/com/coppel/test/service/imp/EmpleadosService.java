package com.coppel.test.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.Empleado;
import com.coppel.test.repository.EmpleadoRepository;
import com.coppel.test.service.IEmpleadoService;

@Service
public class EmpleadosService implements IEmpleadoService{
	
@Autowired EmpleadoRepository empleadoRepositroy;
	
	public List<Empleado> findAllEmpleados()throws GeneralCoppelException {
		
		return empleadoRepositroy.findAll();
    }

    public Empleado findById( Long id) throws GeneralCoppelException{
    	Optional<Empleado> emp=empleadoRepositroy.findById(id);
        return emp.isEmpty()?null:emp.get();       
    }
    
    public Empleado saveEmpleado(Empleado emp) throws GeneralCoppelException{
    	System.out.println("ENTRAMOS..");
    	return  empleadoRepositroy.save(emp); 
    }
	
}
