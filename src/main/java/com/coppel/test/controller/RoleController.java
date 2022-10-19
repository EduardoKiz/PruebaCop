package com.coppel.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.test.model.Role;
import com.coppel.test.service.RoleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/coppelTest/roles")
@RequiredArgsConstructor
public class RoleController {

	
	private final RoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<List<Role>> findAllEmpleados() {
        return ResponseEntity.ok(roleService.findAllRole());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> findById(@PathVariable Long id) {
        
        return ResponseEntity.ok(roleService.findById(id));   
    }    

    @PostMapping
    public ResponseEntity<Role> saveRole(@RequestBody Role rol) {        
        return  ResponseEntity.ok(roleService.saveRole(rol));
        
    }
}
