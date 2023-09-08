package com.unit1.programminginjava.class2;

public class FundamentalOfClass {

	// instance variable
	private String collegeName;
	public String collegeAddress;
	protected int collegeId;
	String phoneNo;
	static String collegeHod;

	// No argument constructor
	public FundamentalOfClass() {

	}

	//parametrized constructor
	public FundamentalOfClass(String collegeName, String collegeAddress, int collegeId, String phoneNo) {
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.collegeId = collegeId;
		this.phoneNo = phoneNo;

	}
	//non static method without return type
	public void showData() {
		System.out.println("College Name : "+collegeName);
		System.out.println("College Address : "+collegeAddress);
		System.out.println("ID : "+collegeId);
		System.out.println("PhoneNo : "+phoneNo);
	}
	//static method
	public static void showStaticData() {
		System.out.println("College HOD : "+collegeHod);
	}
	
	public static void main(String[] args) {
		
		FundamentalOfClass.collegeHod = "Ram Panday";
		FundamentalOfClass obj = new FundamentalOfClass("ABC", "Baneshwor", 123, "3456789");
		obj.showData();
		
		FundamentalOfClass.showStaticData();
		
	}
}
