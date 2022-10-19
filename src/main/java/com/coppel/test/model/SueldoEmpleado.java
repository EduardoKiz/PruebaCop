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
public class SueldoEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idEmpleado;
	private Double montoBruto;
	private Double montoNeto;
	private Double isrNormal;
	private Double isrExcedente;
	private Double montoBono;
	private Double montoVales;
	private Integer mes;
	private Integer anio;
}
