package com.unit1.programminginjava.class3;

public class SuperParent {
	
	protected int num1;
	protected int num2;
	
	public SuperParent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int add() {
		return num1+num2;
	}
	
	public double sub(double num1, double num2) {
		return num1-num2;
	}
}
