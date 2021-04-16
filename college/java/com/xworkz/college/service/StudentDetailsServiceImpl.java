package com.xworkz.college.service;

import com.xworkz.college.constant.Streams;
import com.xworkz.college.dao.StudentDetailsDAO;
import com.xworkz.college.dao.StudentDetailsDAOImpl;
import com.xworkz.college.dto.StudentDetails;

public class StudentDetailsServiceImpl implements StudentDetailsService {

	private StudentDetailsDAO dao;

	public StudentDetailsServiceImpl() {
		dao = new StudentDetailsDAOImpl();
	}

	@Override
	public boolean validAndAdd(StudentDetails det) {
		// TODO Auto-generated method stub
		System.out.println("invoked validAndAdd");
		boolean validate = false;
		if (det != null) {
			String studentName = det.getStudentName();
			if (studentName != null && !studentName.isEmpty()) {
				System.out.println("studentName is valid ");
				validate = true;
			} else {
				System.out.println("studentName is not valid");
				validate = false;
			}
			if (validate) {
				String studentEnrolmentNumber = det.getStudentEnrolmentNumber();
				if (studentEnrolmentNumber != null && !studentEnrolmentNumber.isEmpty()) {
					System.out.println("studentEnrolmentNumber is valid");
					validate = true;
				} else {
					System.out.println("studentEnrolmentNumber is not null");
					validate = false;
				}
				if (validate) {
					String studentSPI = det.getStudentSPI();
					if (studentSPI != null && !studentSPI.isEmpty()) {
						System.out.println("studentSPI is valid");
						validate = true;
					} else {
						System.out.println("studentSPI is invalid");
						validate = false;
					}
				}
				if (validate) {
					System.out.println("det is valid,can invoke add");
					validate = true;
					dao.add(det);
				} else {
					validate = false;
				}
			}
		}
		return validate;
	}

	@Override
	public boolean validAndSearchByName(String studentName) {
		// TODO Auto-generated method stub
		System.out.println("invoked validAndSearchByName");
		boolean validate = false;
		if (studentName != null && !studentName.isEmpty()) {
			System.out.println("studentName is valid");
			validate = true;
		} else {
			System.out.println("studentName is not valid ");
			validate = false;
		}

		if (validate) {
			System.out.println("data is valid can invoked searchByName");
		}
		return validate;
	}

	@Override
	public boolean validAndSearchByStudentEnrolmentNumber(String num) {
		// TODO Auto-generated method stub
		System.out.println("invoked validAndSearchByStudentEnrolmentNumber");
		boolean validate = false;
		if (num != null && !num.isEmpty()) {
			System.out.println("StudentEnrolmentNumber is valid");
			validate = true;
		} else {
			System.out.println("StudentName is not valid");
			validate = false;
		}
		if (validate) {
			System.out.println("data is valid can invoke searchByStudentEnrolmentNumber");
		}
		return validate;
	}

	/*@Override
	public boolean validAndSearchByStream(Streams str) {
		// TODO Auto-generated method stub
		System.out.println("invoked validAndSearchByStream");
		boolean validate=false;
		if(str!=null && !str.isEmpty('&')) {
			
			
		}
		return false;
	}*/

}
