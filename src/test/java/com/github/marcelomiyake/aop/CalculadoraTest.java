package com.github.marcelomiyake.aop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void adicaoTest() {
		assertEquals(5, Calculadora.adicao(2, 3));
	}

	@Test
	public void multiplicacaoTest() {
		assertEquals(6, Calculadora.multiplicacao(2, 3));
	}

	@Test
	public void subtracaoTest() {
		assertEquals(3, Calculadora.subtracao(5, 2));
	}

}