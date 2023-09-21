package com.unit1.programminginjava.class4;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		// try catch finally

		int num1 = 10;
		int num2 = 0;

		try {

			int result = num1 / num2;
			System.out.println("Result : " + result);
		} catch (NullPointerException e) {
			System.out.println("Reason : " + e.getMessage());
		} finally {
			System.out.println("Inside the final block ");
		}

		// try finally

		try {

		} finally {

		}

	}

}
