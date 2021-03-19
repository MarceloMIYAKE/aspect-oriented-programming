package com.github.marcelomiyake.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public aspect LoggerAspect {

	Logger logger = LogManager.getLogger(LoggerAspect.class);

	pointcut callMetodosDaCalculadora() : call(public static int Calculadora.*(..));

	before() : callMetodosDaCalculadora() {
		logger.info("antes de executar");
	}

	after() : callMetodosDaCalculadora() {
		logger.info("depois de executar");
	}
}