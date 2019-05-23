package com.example.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	public void testFactorialValidNum() {
		int fact = Calculator.factorial(4);
		assertEquals(120, fact, "5! is 120");
	}
	
	@Test
	public void testFactorialZero() {
		int fact = Calculator.factorial(0);
		assertEquals(1,fact);
	}
	
	@Test
	public void testNormalDivision() {
		double quotient = Calculator.divide(2,5);
		assertEquals(2.5,quotient);
	}
	
	@Test
	public void testDivisionByZero() {
		double quotient = Calculator.divide(0,2);
		assertEquals(0,quotient);
	}
	
	@Test
	public void testFibNormal() {
		int fib = Calculator.fib(4);
		assertEquals(3,fib);
	}
	
	@Test
	public void testFibZero() {
		int fib = Calculator.fib(0);
		assertEquals(0,fib);
	}
	
	@Test
	public void testFibNeg() {
		int fib = Calculator.fib(-5);
		assertEquals(0,fib);
	}

}
