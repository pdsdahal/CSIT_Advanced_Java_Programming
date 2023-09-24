package com.unit1.programminginjava.class7.serialiationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CollegeSerializeDemo {

	public static void main(String[] args) {

		College college = new College();
		college.setCollegeAddress("Baneshwor");
		college.setCollegeName("Texas International College");
		college.setCollegePAN(234567);

		try {
			FileOutputStream fOS = new FileOutputStream("CollegeObj.doc");
			ObjectOutputStream oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(college);
			oOS.close();
			System.out.println("Object Write Successfully!");

		} catch (Exception e) {

		}

	}
}
