package com.unit1.programminginjava.class1;

import java.util.Scanner;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the string array: ");
		int size = scanner.nextInt();
		scanner.nextLine(); 

		String[] originalArray = new String[size];
		String[] targetArray = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter a String ");
			originalArray[i] = scanner.nextLine();
		}

		// Copy the contents of the original array to the new array
		for(int i=0;i<originalArray.length;i++) {
			targetArray[i] = originalArray[i];
		}
		
		//display using foreach 
		for(String data : targetArray) {
			System.out.println(data);
		}
		
		scanner.close();
	}
}
