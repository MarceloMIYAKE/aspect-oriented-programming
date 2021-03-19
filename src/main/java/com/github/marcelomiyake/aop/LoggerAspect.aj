package com.github.marcelomiyake.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public aspect LoggerAspect {

	Logger logger = LogManager.getLogger(LoggerAspect.class);

	pointcut callCalculadora(int a, int b) : call(public static int Calculadora.*(int, int)) && args(a, b);

	before(int a, int b) : callCalculadora(a, b) {
		logger.info("Entradas: {}, {}", a, b);
	}

	int around(int a, int b) : callCalculadora(a, b) {
		int retorno = proceed(a, b);
		logger.info("Saída: {}", retorno);
		return retorno + 1; // código do mal
	}
}