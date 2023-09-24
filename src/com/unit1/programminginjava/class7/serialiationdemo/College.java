package com.unit1.programminginjava.class7.serialiationdemo;

import java.io.Serializable;

public class College implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int collegePAN;
	private String collegeName;
	private String collegeAddress;
	
	public int getCollegePAN() {
		return collegePAN;
	}
	public void setCollegePAN(int collegePAN) {
		this.collegePAN = collegePAN;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	
}
