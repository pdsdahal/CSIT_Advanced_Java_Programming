package com.unit1.programminginjava.class7;

import java.io.File;
import java.io.FileWriter;

public class FileWriteUsingCharacterStream {
	
	public static void main(String[] args) {
		
		try {
			
			File file = new File("Student.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			
			String message = "\nName : Shyam Pandey\nRollNo : 12";
			fileWriter.write(message);
			
			fileWriter.close();
			System.out.println("File write successfully!");
		}catch(Exception e) {
			
		}
		
	}

}
