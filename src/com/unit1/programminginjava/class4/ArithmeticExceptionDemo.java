package com.unit1.programminginjava.class4;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		int result  = 0;
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);

	}
}
