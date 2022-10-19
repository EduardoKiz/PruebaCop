package com.coppel.test.service;

import java.util.List;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAllEmpleados()throws GeneralCoppelException;
    public Empleado findById( Long id) throws GeneralCoppelException;
    public Empleado saveEmpleado(Empleado emp) throws GeneralCoppelException;
}
