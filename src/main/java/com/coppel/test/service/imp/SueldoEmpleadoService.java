package com.coppel.test.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.Empleado;
import com.coppel.test.model.Entregas;
import com.coppel.test.model.Role;
import com.coppel.test.model.SueldoEmpleado;
import com.coppel.test.model.SueldoMensualDetalle;
import com.coppel.test.model.SueldosConfig;
import com.coppel.test.repository.EmpleadoRepository;
import com.coppel.test.repository.EntregasRepository;
import com.coppel.test.repository.RoleRepository;
import com.coppel.test.repository.SueldoEmpleadoRepository;
import com.coppel.test.repository.SueldosConfigRepository;
import com.coppel.test.service.ISueldoEmpleadoService;

@Service
public class SueldoEmpleadoService implements ISueldoEmpleadoService{

	@Autowired SueldoEmpleadoRepository sueldoEmpleadoRepository;
	@Autowired EntregasRepository entregasRepository;
	@Autowired SueldosConfigRepository sueldosConfigRepository;	
	@Autowired RoleRepository roleRepository;
	@Autowired EmpleadoRepository empleadoRepository;
	
    public SueldoMensualDetalle getSueldo( Long idEmpleado, Integer mes,Integer anio) { 
    	Empleado emp= empleadoRepository.findById(idEmpleado).get();
    	System.out.println("emp:"+emp);
    	Double totalEntregas=0d;
    	List<Entregas> entregas=
    			entregasRepository.findByIdEmpleadoAndMes(idEmpleado, mes, anio);
    	
    	Role rol= roleRepository.findById(emp.getIdRole()).get()!=null?roleRepository.findById(emp.getIdRole()).get():new Role();
    	
    	SueldosConfig sueldoConfig= sueldosConfigRepository.findById(1L).get();
    	for (Entregas ent : entregas) {
    		totalEntregas+= (ent.getCantidadEntregas()*sueldoConfig.getMontoEntrega());
		}
    	    	 	
    	int hrsPorMes= (sueldoConfig.getDiasLaborales()*sueldoConfig.getHrsLaborables()*sueldoConfig.getSemanasPorMes());
    	Double bonoPorHrs=hrsPorMes*rol.getBonoHora();  
    	Double sueldoMensual= rol.getSueldoBase()*hrsPorMes;
    	Double totalBruto= sueldoMensual+ bonoPorHrs+ totalEntregas;
    	Double isrNormal=totalBruto*sueldoConfig.getIsr();
    	Double totalPreFinal=totalBruto-isrNormal;
    	Double isrAdicional=0d;
    	
    	if(totalPreFinal>sueldoConfig.getSueldoTopeIsrAdicional()) {
    		 isrAdicional=totalPreFinal*sueldoConfig.getIsrExcendente();
    	}
    	
    	Double totalFinalSinVales=totalPreFinal-isrAdicional;
    	Double totalVales=totalFinalSinVales*sueldoConfig.getPorcentajeVales();
    	Double totalNeto= totalFinalSinVales-totalVales;
    	SueldoMensualDetalle sueldoEm= new SueldoMensualDetalle();
    	sueldoEm.setNombre(emp.getNombre());
    	sueldoEm.setIdEmpleado(idEmpleado);
    	sueldoEm.setIsrExcedente(isrAdicional);
    	sueldoEm.setIsrNormal(isrNormal);
    	sueldoEm.setMes(mes);
    	sueldoEm.setMontoBono(bonoPorHrs);
    	sueldoEm.setMontoVales(totalVales);
    	sueldoEm.setMontoBruto(totalBruto);
    	sueldoEm.setMontoNeto(totalNeto);
    	sueldoEm.setAnio(anio);
    	sueldoEm.setNumeroEntregas(!entregas.isEmpty()?entregas.size():0);
    	
    	return sueldoEm;
    	
        //return  sueldoEmpleadoRepository.findByIdEmpleadoAndMes(idEmpleado,mes,anio);
       
    }

	public List<SueldoEmpleado> findAllSueldo() {
		// TODO Auto-generated method stub
		return sueldoEmpleadoRepository.findAll();
	}
	
	
	
	
	
}
