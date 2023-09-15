package com.unit1.programminginjava.class3;

public class MultipleInChild implements MultipleInhParent1, MultipleInhParent2 {

	public double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public double div(double num1, double num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		MultipleInChild child = new MultipleInChild();
		System.out.println(child.sub(10, 5));
		System.out.println(child.div(10, 5));
		
		
	}
}
