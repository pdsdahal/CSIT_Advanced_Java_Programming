package com.unit1.programminginjava.class2;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		
		int[][] data = {{1,2,3},{4,5,6}};
		
		
		for(int i=0;i<2;i++) {
			int sumRow  = 0;
			for(int j=0;j<3;j++) {
				System.out.print(" Value at index ["+i+"]"+"["+j+"] : "+data[i][j]);
				sumRow = sumRow+data[i][j];
			}
			System.out.println();
			System.out.println("Sum at row number : "+i + " = "+sumRow);
			
			
		}
		
		
	}
}
