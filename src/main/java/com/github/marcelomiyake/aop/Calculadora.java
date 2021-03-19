package com.github.marcelomiyake.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {

	private static Logger logger = LogManager.getLogger(Calculadora.class);

	public static int adicao(final int a, final int b) {
		logger.info("Entradas: {}, {}", a, b);
		final int resultado = a + b;
		logger.info("Saída: {}", resultado);
		return resultado;
	}

	public static int multiplicacao(final int a, final int b) {
		return a * b;
	}

	public static int subtracao(final int a, final int b) {
		logger.info("Entradas: {}, {}", a, b);
		final int resultado = a - b;
		logger.info("Saída: {}", resultado);
		return resultado;
	}

	private Calculadora() {
	}

}