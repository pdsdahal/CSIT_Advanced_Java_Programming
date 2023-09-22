package com.unit1.programminginjava.class6;

import java.io.File;
import java.io.FileOutputStream;

public class FilreWriteUsingByteStream {

	public static void main(String[] args) {
		
		
		File file = new File("Texas.txt");
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String message = "File write using byte stream at Texas";
		
		byte[] messages = message.getBytes();
		
		fileOutputStream.write(messages);
		System.out.println("Message write successfully!");
		fileOutputStream.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
