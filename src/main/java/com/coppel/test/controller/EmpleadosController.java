package com.coppel.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.test.model.Empleado;
import com.coppel.test.service.EmpleadosService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/coppelTest/empleados")
@RequiredArgsConstructor
public class EmpleadosController {

	
	private final EmpleadosService empleadoService;

    @GetMapping("/all")
    public ResponseEntity<List<Empleado>> findAllEmpleados() {
        return ResponseEntity.ok(empleadoService.findAllEmpleados());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> findById(@PathVariable Long id) {
        return ResponseEntity.ok(empleadoService.findById(id));
        
    }

    @PostMapping
    public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado emp) { 	
        return  ResponseEntity.ok(empleadoService.saveEmpleado(emp));
        
    }
	
}
