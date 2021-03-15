package cl.sanders.tarea1.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import cl.sanders.tarea1.service.Fibonacci;


@Service
public class FibonacciImpl implements Fibonacci {

	/**
	 * método para calcular valor N de la secuencia del Fibonacci
	 * con un algoritmo iterativo
	 */
	@Override
	public BigDecimal calculate(long number) {
		BigDecimal bigNumber = BigDecimal.valueOf(number);
		if(bigNumber.equals(BigDecimal.ONE) || bigNumber.equals(BigDecimal.ZERO)) {
			return bigNumber;
		}
		BigDecimal fibonacci = BigDecimal.ONE;
		BigDecimal previousFibonacci = BigDecimal.ONE;
	
		for(long n=2; n<number; n++) {
			BigDecimal temp = fibonacci;
			fibonacci = fibonacci.add(previousFibonacci);
			previousFibonacci = temp;
		}
		return fibonacci;
	}
}
