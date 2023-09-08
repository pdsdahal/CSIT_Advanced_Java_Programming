package com.unit1.programminginjava.class2;

import java.util.Scanner;

public class FindMaxFromRowArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of row : ");
		int row = scanner.nextInt();
		
		System.out.println("eneter the size of column : ");
		int column = scanner.nextInt();
		
		
		int[][] dataMat = new int[row][column];
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<column;j++) {
				
				System.out.println("enter a number : ");
				int num = scanner.nextInt();
				dataMat[i][j] = num;
			}
		}
		
		for(int i=0;i<row;i++) {
			
			int tempMax = 0;
			for(int j=0;j<column;j++) {
				
				int num = dataMat[i][j];
				if(num>tempMax) {
					tempMax = num;
				}
			}
			System.out.println("Max at index number : "+i + " = "+tempMax);
		}
		
		
		
		scanner.close();
	}
}
