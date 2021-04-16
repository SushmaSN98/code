package com.xworkz.college.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.college.constant.Streams;
import com.xworkz.college.dto.StudentDetails;

public class StudentDetailsDAOImpl implements StudentDetailsDAO {
	private List<StudentDetails> lists;

	// private StudentDetailsDAO dao=new StudentDetailsDAOImpl();

	public StudentDetailsDAOImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
		lists = new ArrayList<StudentDetails>();
	}

	@Override
	public void add(StudentDetails det) {
		System.out.println("invoked save with dto type");
		if (det != null) {
			System.out.println("dto is not null,can add to lists");
			lists.add(det);
			System.out.println(det);
		} else {
			System.out.println("det is null");
		}

	}

	@Override
	public void searchByName(String studentName) {
		// TODO Auto-generated method stub
		System.out.println("invoked searchByName");
		if (studentName != null) {
			for (StudentDetails det : lists) {
				String studentName1 = det.getStudentName();
				if (studentName1.equals(studentName)) {
					System.out.println(det);
				} else {
					System.out.println("studentName is  equal");
				}
			}
		} else {
			System.out.println("name is null");
		}

	}

	@Override
	public void searchBystudentEnrolmentNumber(String num) {
		// TODO Auto-generated method stub
		System.out.println("invoked searchBystudentEnrolmentNumber");
		if (num != null) {
			for (StudentDetails det : lists) {
				String studentEnrolmentNumber1 = det.getStudentEnrolmentNumber();
				if (studentEnrolmentNumber1.equals(num)) {
					System.out.println(det);
				} else {
					System.out.println("studentEnrolmentNumber is  equal");
				}
			}
		} else {
			System.out.println("studentEnrolmentNumber is null");
		}

	}

	@Override
	public void searchByStream(Streams str) {
		// TODO Auto-generated method stub
		System.out.println("invoked searchByStream");
		if(str!=null) {
			for(StudentDetails det :lists) {
				Streams stream1=det.getStudentStream();
				if(stream1 .equals(str)) {
					System.out.println(det);
				}else {
					System.out.println("studentStream is not equal");
				}
				}
		}
			else {
				System.out.println("studentStream is null");
			}
		}

	}


