package com.unit1.programminginjava.class3;

public class SuperChild extends SuperParent {
	
	private String data;
	
	public SuperChild(int num1, int num2, String data) {
		super(num1, num2);
		this.data = data;
	}
	public void executeAddition() {
		int result =  super.add();
		System.out.println(super.num1 + " + "+super.num2 + " = "+result);
	}
	
	public static void main(String[] args) {
		
		SuperChild child = new SuperChild(10, 4, "Texas");
		child.executeAddition();
	}
	

}
