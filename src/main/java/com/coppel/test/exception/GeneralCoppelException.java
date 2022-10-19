package com.coppel.test.exception;

import org.springframework.core.NestedRuntimeException;


public class GeneralCoppelException extends NestedRuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GeneralCoppelException() {
        super(String.format("Hay un error en el servicio actual"));
    }

}
