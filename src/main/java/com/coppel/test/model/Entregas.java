package com.coppel.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Entregas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idEmpleado;
	private String nombre;
	private Integer idRole;
	private Integer mes;
	private Boolean esPorMes;
	private Integer dia;
	private Integer cantidadEntregas;
	private Integer anio;
}
