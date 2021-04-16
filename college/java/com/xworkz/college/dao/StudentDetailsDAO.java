package com.xworkz.college.dao;

import com.xworkz.college.constant.Streams;
import com.xworkz.college.dto.StudentDetails;

public interface StudentDetailsDAO {
	
	public void add(StudentDetails det);
	public void searchByName(String studentName);
	public void searchBystudentEnrolmentNumber(String num);
	public void searchByStream(Streams str);

}
