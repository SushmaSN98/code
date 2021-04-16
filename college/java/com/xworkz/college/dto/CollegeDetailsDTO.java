package com.xworkz.college.dto;

import com.xworkz.college.constant.Streams;

public class CollegeDetailsDTO {
	
	private String collegeName;
	private Streams stream;
	
	public CollegeDetailsDTO() {
	 System.out.println("created "+this.getClass().getSimpleName());	
	}
	
	public CollegeDetailsDTO(String collegeName,Streams stream) {
		this.collegeName=collegeName;
		this.stream=stream;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public Streams getStream() {
		return stream;
	}
	
	public void setStream(Streams stream) {
		this.stream = stream;
	}

}
