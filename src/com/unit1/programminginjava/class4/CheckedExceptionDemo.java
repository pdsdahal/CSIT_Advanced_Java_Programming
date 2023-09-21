package com.unit1.programminginjava.class4;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("");	
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
