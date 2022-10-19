package com.coppel.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coppel.test.model.SueldoEmpleado;

public interface SueldoEmpleadoRepository extends JpaRepository<SueldoEmpleado, Long> {

@Query("select a from SueldoEmpleado a where a.idEmpleado=?1  and a.mes=?2 and a.anio=?3")
public SueldoEmpleado findByIdEmpleadoAndMes(Long idEmpleado, Integer mes,Integer anio);

}
