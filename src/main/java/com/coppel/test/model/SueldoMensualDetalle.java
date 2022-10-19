package com.coppel.test.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SueldoMensualDetalle {

	private String nombre;
	private Long idEmpleado;
	private Double montoBruto;
	private Double montoNeto;
	private Double isrNormal;
	private Double isrExcedente;
	private Double montoBono;
	private Double montoVales;
	private Integer mes;
	private Integer anio;
	private Integer numeroEntregas;
}
