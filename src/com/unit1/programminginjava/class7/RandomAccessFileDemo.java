package com.unit1.programminginjava.class7;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	
	public static void main(String[] args) {
		try {
		
			RandomAccessFile rAF = new RandomAccessFile("Employee.txt", "rw");
			rAF.seek(0);
			String message = "Employee Details \n Name : Ram Pandey";
			rAF.write(message.getBytes());
			System.out.println("File Write Successfully!");
			
			rAF.seek(8);
			
			int data;
			while((data = rAF.read())!=-1) {
				char result = (char) data;
				System.out.print(result);
			}
			rAF.close();
		}catch(Exception e) {
			
		}
		
	}

}
