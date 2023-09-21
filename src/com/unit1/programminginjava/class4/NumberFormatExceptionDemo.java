package com.unit1.programminginjava.class4;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {

		String gender = "100.78";

		try {
			int flag = Integer.valueOf(gender);
			System.out.println("Value of int : " + flag);
		} catch (NumberFormatException e) {
			System.out.println("Reason : " + e.getMessage());
		}
	}

}
