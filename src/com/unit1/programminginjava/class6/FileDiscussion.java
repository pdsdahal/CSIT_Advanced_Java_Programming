package com.unit1.programminginjava.class6;

import java.io.File;
import java.io.IOException;

public class FileDiscussion {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Texas.txt");
		
		if(file.createNewFile()) {
			System.out.println("File created successfully!");
		}else {
			System.out.println("Failed to create..");
		}
	}

}
