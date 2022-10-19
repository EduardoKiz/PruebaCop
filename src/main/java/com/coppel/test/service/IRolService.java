package com.coppel.test.service;

import java.util.List;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.Role;

public interface IRolService {

	public List<Role> findAllRole()throws GeneralCoppelException;

    public Role findById( Long id)throws GeneralCoppelException;
    
    
    public Role saveRole(Role rol)throws GeneralCoppelException;
}
