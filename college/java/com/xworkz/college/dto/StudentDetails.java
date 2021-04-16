package com.xworkz.college.dto;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

import com.xworkz.college.constant.Streams;

public class StudentDetails extends CollegeDetailsDTO{
	
	private String studentName;
	private String studentEnrolmentNumber;
	private String studentSPI;
	private Streams studentStream;
	
	public StudentDetails() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	

	

	
	public StudentDetails(String studentName,String studentEnrolmentNumber,String studentSPI,Streams studentStream) {
		this.studentName=studentName;
		this.studentEnrolmentNumber=studentEnrolmentNumber;
		this.studentSPI=studentSPI;
		this.studentStream=studentStream;
	}
	
	
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentEnrolmentNumber=" + studentEnrolmentNumber
				+ ", studentSPI=" + studentSPI + ", studentStream=" + studentStream + "]";
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	 public String getStudentEnrolmentNumber() {
		return studentEnrolmentNumber;
	}
	 
	 public void setStudentEnrolmentNumber(String studentEnrolmentNumber) {
		this.studentEnrolmentNumber = studentEnrolmentNumber;
	}
	 
	 public String getStudentSPI() {
		return studentSPI;
	}
	 
	 public void setStudentSPI(String studentSPI) {
		this.studentSPI = studentSPI;
	}
	 
	public Streams getStudentStream() {
		return studentStream;
	}
	public void setStudentStream(Streams studentStream) {
		this.studentStream = studentStream;
	}

}
