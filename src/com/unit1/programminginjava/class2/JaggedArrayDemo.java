package com.unit1.programminginjava.class2;

public class JaggedArrayDemo {
	
	public static void main(String[] args) {
		
		int[][] jaggedDemo = {{1,2,3},{5,6},{7,8,9,10}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<jaggedDemo[i].length;j++) {
				
				System.out.print(jaggedDemo[i][j] + " ");
			}
			System.out.println();
		}
	}

}
