package com.coppel.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coppel.test.model.Entregas;

public interface EntregasRepository  extends JpaRepository<Entregas, Long> {

	@Query("select a from Entregas a where a.idEmpleado=?1 and a.mes=?2 and a.anio=?3")
	public List<Entregas> findByIdEmpleadoAndMes(Long idEmpleado, Integer mes,Integer anio);
}
