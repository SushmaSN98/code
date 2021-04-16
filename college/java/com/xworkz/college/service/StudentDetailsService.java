package com.xworkz.college.service;

import com.xworkz.college.constant.Streams;
import com.xworkz.college.dto.StudentDetails;

public interface StudentDetailsService {
	public boolean validAndAdd(StudentDetails det);
	public boolean validAndSearchByName(String studentName);
	public boolean validAndSearchByStudentEnrolmentNumber(String num);
	//public boolean validAndSearchByStream(Streams str);

}
