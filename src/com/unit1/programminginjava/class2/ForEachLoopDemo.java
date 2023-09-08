package com.unit1.programminginjava.class2;

public class ForEachLoopDemo {
	
	public static void main(String[] args) {
		
		String[] collegeName = {"Texas","Abc","Xyz"};
		
		//foreach
		for(String college : collegeName) {
			
			college = college.toLowerCase();
			
			int vowelCount = 0;
			int conCount = 0;
			
			for(int i=0;i<college.length();i++) {
				char data = college.charAt(i);
			
				if(data == 'a' || data == 'e' || data =='i' || data=='o' || data=='u') {
				
					vowelCount = vowelCount + 1;
				}else {
					conCount = conCount+1;
				}
			}
			System.out.println("Input : "+college + " Vowel Count : "+vowelCount + " Con. Count "+conCount);
		}
	}

}
