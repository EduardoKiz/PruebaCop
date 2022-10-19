package com.coppel.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.test.model.SueldosConfig;
import com.coppel.test.repository.SueldosConfigRepository;

@Service
public class SueldosConfigService {

@Autowired SueldosConfigRepository sueldosConfigRepository;	

	public SueldosConfig getConfig() {
		return sueldosConfigRepository.findById(1l).get();
	}
}
