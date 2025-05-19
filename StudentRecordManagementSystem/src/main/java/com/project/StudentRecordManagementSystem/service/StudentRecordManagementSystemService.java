package com.project.StudentRecordManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.StudentRecordManagementSystem.GlobalException.StudentRecordNotFoundException;
import com.project.StudentRecordManagementSystem.model.Student;
import com.project.StudentRecordManagementSystem.repo.IstudentRecordManagementSystemRepo;

@Service
public class StudentRecordManagementSystemService implements IstudentRecordManagementSystemService {
	
	@Autowired
	private IstudentRecordManagementSystemRepo repo;

	@Override
	public Student registerStudentRecord(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> fetchAllStudentRecords() {
		return repo.findAll();
	}

	@Override
	public Optional<Student> fetchById(Integer id)throws StudentRecordNotFoundException {
		Optional<Student> status = repo.findById(id);
		if(status.isPresent()) {
		return status;
		}
		else {
			throw new StudentRecordNotFoundException("Student Record Not Found");
		}
	}

	@Override
	public String deleteStudentRecordById(Integer id)throws StudentRecordNotFoundException {
		Optional<Student> status = repo.findById(id);
		if(status.isPresent()) {
		repo.deleteById(id);
		return "Deleted Student Record With ID: " + status.get().getId();
		}
		else {
			throw new StudentRecordNotFoundException("Student Record Not Found With ID: " + status.get().getId());
		}
		
	}

	@Override
	public String upDateStudentRecord(Student student) {
		Optional<Student> studentDetails = repo.findById(student.getId());
		if(studentDetails.isPresent()) {
			 Student st = studentDetails.get(); // Get existing record

		        // Update fields with new values from the input `student`
		        st.setName(student.getName());
		        st.setEmail(student.getEmail());
		        st.setAge(student.getAge());

		        repo.save(st); // Save updated record
		        return "Student record updated successfully";
		}
		else {
			throw new StudentRecordNotFoundException("Student Record Not Found");
		}
	}

	@Override
	public List<Student> registerAllStudentRecord(List<Student> students) {
		return repo.saveAll(students);
	}
	
	
	
}
