package com.project.StudentRecordManagementSystem.service;

import java.util.*;

import com.project.StudentRecordManagementSystem.model.Student;

public interface IstudentRecordManagementSystemService {
	
	 Student registerStudentRecord(Student student);
	 List<Student> fetchAllStudentRecords();
	 Optional<Student> fetchById(Integer id);
	 String deleteStudentRecordById(Integer id);
	 String upDateStudentRecord(Student student);
	 List<Student> registerAllStudentRecord(List<Student> students);
	 

}
