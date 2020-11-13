package com.example.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@BeforeClass
	public static void oneTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public static void setup() {
		//runs before each test
	}
	
	@AfterEach
	public static void tearDown() {
		//runs after each test
	}
	
	//assertEquals(val1,val2)
	//assertFalse(val)
	//assertTrue(val)
	//assertSame(val1,val2)
	//assertNotSame(val1,val2)
	//assertNull(val)
	//assertNotNull(val)
	
	
	
	
	@Test
	public void testFactorialValidNum() {
		int fact = Calculator.factorial(5);
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
