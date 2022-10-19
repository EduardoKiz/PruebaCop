package com.coppel.test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.test.model.SueldoEmpleado;
import com.coppel.test.model.SueldoMensualDetalle;
import com.coppel.test.service.ISueldoEmpleadoService;
import com.coppel.test.service.imp.SueldoEmpleadoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/coppelTest/sueldos")
@RequiredArgsConstructor
public class SueldoEmpleadoController {

	@Autowired ISueldoEmpleadoService sueldoEmpleadoService;
	
	
    @GetMapping("/{idEmpleado}/{mes}/{anio}")
    public ResponseEntity<SueldoMensualDetalle> getSueldoPorEmpleado(@PathVariable Long idEmpleado,@PathVariable Integer mes,@PathVariable Integer anio) {
        return ResponseEntity.ok(sueldoEmpleadoService.getSueldo(idEmpleado, mes,anio));
    }
    
    
    @GetMapping("/all")
    public ResponseEntity<List<SueldoEmpleado>> findAllSueldo() {
        return ResponseEntity.ok(sueldoEmpleadoService.findAllSueldo());
    }

}
