package com.coppel.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.test.model.Entregas;
import com.coppel.test.service.IEntregasService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/coppelTest/entregas")
@RequiredArgsConstructor
public class EntregasEmpleadoController {

	@Autowired IEntregasService entregasService;
	@PostMapping
	public ResponseEntity<Entregas> saveEntrega(@RequestBody Entregas ent) { 	
	        return  ResponseEntity.ok(entregasService.saveEntrega(ent));	        
	}
	
	@GetMapping("/{idEmpleado}/{mes}/{anio}")
	public ResponseEntity<List<Entregas>> getEntregas(
			@PathVariable Long idEmpleado,@PathVariable Integer mes,@PathVariable Integer anio) { 	
	        return  ResponseEntity.ok(entregasService.getEntregas(idEmpleado, mes,anio));	        
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Entregas>> getEntregasAll() { 	
	        return  ResponseEntity.ok(entregasService.getEntregasAll());	        
	}	
}
