package com.coppel.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.Role;
import com.coppel.test.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired RoleRepository roleRepository;
	

	public List<Role> findAllRole() {	
		return roleRepository.findAll();
    }

    public Role findById( Long id) {
    	Optional<Role> rol=roleRepository.findById(id);
        return rol.isEmpty()?null:rol.get();        
    }
    
    
    public Role saveRole(Role rol) {
    	return  roleRepository.save(rol); 
    }
	
}
