package com.unit1.programminginjava.class6;

import java.io.File;
import java.io.FileInputStream;

public class FilreReadUsingByteStream {

	public static void main(String[] args) {
		
		
		File file = new File("Texas.txt");
		
		try {
		FileInputStream fileIs = new FileInputStream(file);
		
		int data;
		while((data = fileIs.read()) != -1) {
			
			char result = (char) data;
			System.out.print(result);
		}
		fileIs.close();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
