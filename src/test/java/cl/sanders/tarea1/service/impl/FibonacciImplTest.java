package cl.sanders.tarea1.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import cl.sanders.tarea1.service.Fibonacci;

class FibonacciImplTest {

	/**
	 * validamos que algoritmo implementado en la clase FibonacciImpl
	 * retorna resultado igual al resultado encontrado en una tabla de los numeros de fibonacci
	 * https://miniwebtool.com/es/list-of-fibonacci-numbers/?number=100
	 */
	@Test
	void test() {
		Fibonacci fibonacci = new FibonacciImpl();
		assertEquals(new BigDecimal("218922995834555169026"), fibonacci.calculate(99)); 
	}
}
