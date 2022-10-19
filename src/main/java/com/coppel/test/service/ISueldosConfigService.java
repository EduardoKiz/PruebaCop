package com.coppel.test.service;

import com.coppel.test.exception.GeneralCoppelException;
import com.coppel.test.model.SueldosConfig;

public interface ISueldosConfigService {


	public SueldosConfig getConfig() throws GeneralCoppelException;
}
