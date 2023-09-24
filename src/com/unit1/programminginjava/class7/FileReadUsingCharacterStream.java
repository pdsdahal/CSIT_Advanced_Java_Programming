package com.unit1.programminginjava.class7;

import java.io.File;
import java.io.FileReader;

public class FileReadUsingCharacterStream {
	
	public static void main(String[] args) {
		
		try {
			
			File file = new File("Student.txt");
			FileReader fileReader = new FileReader(file);
			
			int data;
			while((data = fileReader.read())!=-1) {
				
				char result = (char) data;
				System.out.print(result);
			}
			fileReader.close();
			
			
			System.out.println("\n\n");
			//files methods
			if(file.exists()) {
				String filePath = file.getAbsolutePath();
				System.out.println(filePath);
				
				System.out.println("Size "+file.length());
				
				
				if(file.delete()) {
					System.out.println("File Deleted Successfully");
				}
				
			}
			
		}catch(Exception e) {
			
		}
		
	}

}
