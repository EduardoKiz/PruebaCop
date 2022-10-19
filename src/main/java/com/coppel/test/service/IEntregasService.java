package com.coppel.test.service;

import java.util.List;

import com.coppel.test.model.Entregas;

public interface IEntregasService {
	 public Entregas saveEntrega( Entregas ent);
	    public List<Entregas> getEntregas( Long idEmpleado, Integer mes,Integer anio);
	    public List<Entregas> getEntregasAll();
}
