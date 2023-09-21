package com.unit1.programminginjava.class4;

public class CustomExceptionImpl {
	
	public void ageCheck(int age) throws CustomException {
		
		if(age<18) {
			throw new CustomException("You are not eligible. Your age is under 18.");
		}
		
		System.out.println("You are allows to vote.");
		System.out.println("Your age is : "+age);
		
	}
	
	
	public static void main(String[] args) {
		
		CustomExceptionImpl obj = new CustomExceptionImpl();
		try {
			obj.ageCheck(17);
		}catch(CustomException e) {
			System.out.println("Reason : "+e.getMessage());
		}finally {
			System.out.println("Inside the final block..");
		}
	}

}
