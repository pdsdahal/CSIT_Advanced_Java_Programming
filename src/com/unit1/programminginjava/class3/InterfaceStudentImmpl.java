package com.unit1.programminginjava.class3;

public class InterfaceStudentImmpl implements InterfaceStudent {

	private String fullName;
	private String address;
	
	public void showStudentData() {
		System.out.println("Full Name : "+fullName);
		System.out.println("Address : "+address);
	}

	public void setStudentData(String fullName, String address) {
		this.fullName = fullName;
		this.address = address;
	}

	
	public static void main(String[] args) {
		
		InterfaceStudentImmpl impl = new InterfaceStudentImmpl();
		impl.setStudentData("Ram Dahal", "Mitrapark");
		impl.showStudentData();
	}
}
