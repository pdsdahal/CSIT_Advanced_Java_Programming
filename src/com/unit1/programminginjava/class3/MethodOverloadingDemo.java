package com.unit1.programminginjava.class3;

public class MethodOverloadingDemo {

	
	public void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Sum of "+num1+ " + "+num2 + " = "+result);
	}
	
	public void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println("Sum of "+num1+ " + "+num2 + " = "+result);
	}
	
	public void add(String num1, String num2) {
		String result = num1 +"  "+num2;
		System.out.println("Name : "+result);
	}
	
	public void add(String num1, String num2, String num3) {
		String result = num1 +"  "+num2 + " "+num3;
		System.out.println("Full Name : "+result);
	}
	
	public void add() {
		int num1= 100;
		int num2 = 200;
		int result = num1+num2;
		System.out.println(num1 + "+ "+ num2+ " = "+result);
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.add(12.0, 13.0);
		demo.add();
		demo.add("Ram", "Pd", "Panday");
	}
	
}
