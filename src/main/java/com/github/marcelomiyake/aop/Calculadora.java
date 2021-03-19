package com.github.marcelomiyake.aop;

public class Calculadora {

	public static int adicao(final int a, final int b) {
		return a + b;
	}

	public static int subtracao(final int a, final int b) {
		return a - b;
	}

	private Calculadora() {
	}

}