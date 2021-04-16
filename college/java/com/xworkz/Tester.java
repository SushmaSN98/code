package com.xworkz;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.college.constant.Streams;
import com.xworkz.college.dao.StudentDetailsDAO;
import com.xworkz.college.dao.StudentDetailsDAOImpl;
import com.xworkz.college.dto.StudentDetails;
import com.xworkz.college.service.StudentDetailsService;
import com.xworkz.college.service.StudentDetailsServiceImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentDetails det1=new StudentDetails("Kavitha", "2ka16ec056"," 90P", Streams.BE);
		
	
		
		StudentDetails det2=new StudentDetails("Suma", "2ka16ec047"," 80P", Streams.MCA);
		
		StudentDetailsDAO dao=new StudentDetailsDAOImpl();
		dao.add(det1);
		dao.add(det2);
		System.out.println(" ");
		
		StudentDetailsService service=new StudentDetailsServiceImpl();
		service.validAndAdd(det1);
		service.validAndAdd(det2);
		System.out.println(" ");
		
		dao.searchByName("Suma");
		System.out.println("");
		service.validAndSearchByName("Kavitha");
		System.out.println(" ");
		
		dao.searchBystudentEnrolmentNumber("2ka16ec047");
		System.out.println(" ");
		service.validAndSearchByStudentEnrolmentNumber("2ka16ec047");
		System.out.println(" ");
		
		dao.searchByStream(Streams.BE);
		System.out.println(" ");
		
		
		/*List<StudentDetails> list=new ArrayList<StudentDetails>();
        StudentDetails det=new StudentDetails("Amrutha", 28, 90, Streams.BE);
        StudentDetails det3=new StudentDetails("Subhash", 47, 80, Streams.MCA);
        list.add(det);
        list.add(det3);
        System.out.println(list);*/
        
        
        
        
	}

}
