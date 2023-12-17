package com.unit8.rmicorba.class1;

import java.io.Serializable;

public class JavaBeanDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//simple property
	private int rollNo;
	private String employeeName;

	//boolean property
	private boolean gender;
	
	//index property
	private String[] academics;
	
	public JavaBeanDemo() {
		
	}

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String[] getAcademics() {
		return academics;
	}

	public void setAcademics(String[] academics) {
		this.academics = academics;
	}
	
	
	
}
