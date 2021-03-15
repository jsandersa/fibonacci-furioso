package cl.sanders.tarea1.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.sanders.tarea1.service.Fibonacci;

@RestController
public class Tarea1Controller {
	
	@Autowired
	private Fibonacci fibonacci;
	
	@GetMapping(value = "fibonacci/calculate/{number}")
	public BigDecimal calculateFibonacci(@PathVariable long number) {
		
		return fibonacci.calculate(number);
		
	}
}
