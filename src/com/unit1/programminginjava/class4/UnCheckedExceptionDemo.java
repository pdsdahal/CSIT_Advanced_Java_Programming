package com.unit1.programminginjava.class4;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		
		String collegeName = null;
		int length = 0;
		
		try {
			 length = collegeName.length();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Length of given string is : "+length);
		
	}
}
