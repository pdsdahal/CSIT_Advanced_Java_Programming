package com.unit1.programminginjava.class7.serialiationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CollegeDeSerializeDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fIS = new FileInputStream("CollegeObj.doc");
			ObjectInputStream oIS = new ObjectInputStream(fIS);

			College college = (College) oIS.readObject();

			System.out.println("Address : " + college.getCollegeAddress());
			System.out.println("Name : " + college.getCollegeName());
			System.out.println("PAN : " + college.getCollegePAN());

			oIS.close();
		} catch (Exception e) {

		}

	}
}
