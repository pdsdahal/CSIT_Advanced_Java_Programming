package com.unit1.programminginjava.class4;

public class ThrowsDemo {

	public void showCollegeName(String collegeName) throws ArithmeticException, NullPointerException{

		int num1 = 10;
		int num2 = 0;
		int result  = num1/num2;
		System.out.println("Result : "+result);
		System.out.println("length of chars : " + collegeName.length());
	}

	public static void main(String[] args) {

		ThrowsDemo demo = new ThrowsDemo();
		try {
			demo.showCollegeName("Te");
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Reason : " + e.getMessage());
		}
	}

}
