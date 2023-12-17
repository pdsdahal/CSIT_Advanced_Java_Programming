package com.unit8.rmicorba.class1;

import java.rmi.Naming;
import java.util.Scanner;

public class ClientProgram {
	
	public static void main(String[] args) {
		
		
		try {
			CalculatorInt calculatorInt = (CalculatorInt) Naming.lookup("rmi://localhost:4345/demo");
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter  two numbers ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Enter a string");
			String data = scanner.nextLine();
			
			int addResult =  calculatorInt.add(num1, num2);
			System.out.println("Result of "+num1 + " + "+num2 + " = "+addResult);
			
			String reverseReult = calculatorInt.reverseData(data);
			System.out.println("Reverse of "+data+" = "+reverseReult);
			
			scanner.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
