package com.coppel.test.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.coppel.test.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	


}
