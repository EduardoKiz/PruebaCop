package com.coppel.test.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.SueldosConfig;
import com.coppel.test.repository.SueldosConfigRepository;
import com.coppel.test.service.ISueldosConfigService;

@Service
public class SueldosConfigService implements ISueldosConfigService{

@Autowired SueldosConfigRepository sueldosConfigRepository;	

	public SueldosConfig getConfig() throws GeneralCoppelException{
		return sueldosConfigRepository.findById(1l).get();
	}
}
