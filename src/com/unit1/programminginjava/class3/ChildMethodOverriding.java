package com.unit1.programminginjava.class3;

public class ChildMethodOverriding extends ParentMethodOverriding {

	public void showCollegeDetails(String collegeName, String collegeAddress) {
		System.out.println("From Child class : ");
		System.out.println("College Details : "+collegeName + "\n"+collegeAddress);
	}
	
	public static void main(String[] args) {
		
		ParentMethodOverriding parent = new ParentMethodOverriding();
		parent.showCollegeDetails("Texas", "Baneshwor");
		
		//child class method 
		ParentMethodOverriding parent1 = new ChildMethodOverriding();
		parent1.showCollegeDetails("Texas", "Kathmandu");
		
		
	}
}
