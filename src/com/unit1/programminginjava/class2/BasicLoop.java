package com.unit1.programminginjava.class2;

public class BasicLoop {
	
	public static void main(String[] args) {
		
		//do while 
		int flag = 0;
		do {
			System.out.println("Inside do");
			flag++;
		}while(flag<3);
		
		
		//while
		int counter = 0;
		while(counter<3) {
			System.out.println("Inside while block. "+counter);
			counter++;
		}
		
		//for 
		
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

}
