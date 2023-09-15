package com.unit1.programminginjava.class3;

public final class FinalVariableDemo {

	public static void main(String[] args) {

		//use 1 : to create constant variable in java
		final int num1 = 100;

		int num2 = 100;
		if (num1 == 100) {
			num2 = num1 + 200;
		}

		System.out.println("Num1 : " + num2);
	}

}
