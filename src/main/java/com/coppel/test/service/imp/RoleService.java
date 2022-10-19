package com.coppel.test.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.Role;
import com.coppel.test.repository.RoleRepository;
import com.coppel.test.service.IRolService;

@Service
public class RoleService implements IRolService{

	@Autowired RoleRepository roleRepository;
	

	public List<Role> findAllRole() throws GeneralCoppelException {	
		return roleRepository.findAll();
    }

    public Role findById( Long id)throws GeneralCoppelException {
    	Optional<Role> rol=roleRepository.findById(id);
        return rol.isEmpty()?null:rol.get();        
    }
    
    
    public Role saveRole(Role rol)throws GeneralCoppelException {
    	return  roleRepository.save(rol); 
    }
	
}
