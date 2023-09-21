package com.unit1.programminginjava.class4;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {

		int[] rollNo = { 1, 5, 7, 89, 9 };

		try {
			int valueAtIndex = rollNo[5];
			System.out.println("Value at index 5 : " + valueAtIndex);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
