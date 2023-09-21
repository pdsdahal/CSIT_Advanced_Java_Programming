package com.unit1.programminginjava.class4;

public class MultiCatchBlockDemo {
	
	public static void main(String[] args) {
	
		try {
			
			System.out.println("Write code that throws exception");
		}catch(NumberFormatException | NullPointerException | ArithmeticException e) {
			System.out.println("Handle only mentioned excepton class");
		}
	}

}
