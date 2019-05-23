package com.example.calc;

public class Calculator {

	public static int factorial(int num) {
		int result = 1;
		
		for(int i=1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static double divide(int divisor, int dividend) {
		if(divisor == 0) return 0;
		
		return (double)dividend / divisor;
	}
	
	public static int fib(int num) {
		if(num < 0) return 0;
		if(num == 0) return 0;
		if(num == 1) return 1;
		
		return fib(num -1) + fib(num-2);
	}
	
	public static int max(int a, int b) {
		return 0;
	}
	
}
