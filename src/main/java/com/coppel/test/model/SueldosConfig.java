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
public class SueldosConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer diasLaborales;
	private Double montoEntrega;
	private Double isr;
	private Double isrExcendente;
	private Double porcentajeVales;
	private Integer semanasPorMes;
	private Integer hrsLaborables;
	private Double sueldoTopeIsrAdicional;
	
}
