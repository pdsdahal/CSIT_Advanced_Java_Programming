package com.unit1.programminginjava.class1;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();
		
		double  addResult = num1 + num2;
		double  subResult = num1 - num2;
		double  mulResult = num1 * num2;
		double  divResult = num1 / num2;
		
		System.out.println(num1 +" + "+num2 + " = "+addResult);
		System.out.println(num1 +" - "+num2 + " = "+subResult);
		System.out.println(num1 +" * "+num2 + " = "+mulResult);
		System.out.println(num1 +" / "+num2 + " = "+divResult);
		
		scanner.close();
	}

}
