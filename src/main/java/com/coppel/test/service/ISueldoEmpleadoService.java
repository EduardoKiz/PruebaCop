package com.coppel.test.service;

import java.util.List;

import com.coppel.test.model.SueldoEmpleado;
import com.coppel.test.model.SueldoMensualDetalle;

public interface ISueldoEmpleadoService {

	 public SueldoMensualDetalle getSueldo( Long idEmpleado, Integer mes,Integer anio);
	 public List<SueldoEmpleado> findAllSueldo();
}
