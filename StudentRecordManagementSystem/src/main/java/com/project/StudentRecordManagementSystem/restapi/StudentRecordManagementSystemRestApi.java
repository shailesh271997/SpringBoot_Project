package com.project.StudentRecordManagementSystem.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudentRecordManagementSystem.model.Student;
import com.project.StudentRecordManagementSystem.service.IstudentRecordManagementSystemService;
import com.project.StudentRecordManagementSystem.service.StudentRecordManagementSystemService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/StudentRecordManagementSystem-api")
@Tag(name="Student-Record-Management-System Controller", description="This has 5 methods to update,delete,get,post for the student record")
public class StudentRecordManagementSystemRestApi {
	
	
	@Autowired
	private IstudentRecordManagementSystemService service;
	
	
	@PostMapping("/add-student-details")
	@Operation(summary="Post Operation", description="This API method would accept Student info and Register it inside the database")
	public ResponseEntity<Student> addStudentRecord(@RequestBody Student student){
		Student student1 = service.registerStudentRecord(student);
		return new ResponseEntity<Student>(student1,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/display-student-details")
	@Operation(summary="Get Operation", description="This API method would get you all the student recored from the database")
	public ResponseEntity<List<Student>> getAllStudentRecords(){
		List<Student> records = service.fetchAllStudentRecords();
		return new ResponseEntity<List<Student>>(records,HttpStatus.OK);
	}
	
	@GetMapping("/find-student-details-byid/{id}")
	@Operation(summary="Get Operation", description="This API method would get you student record based on the ID number")
	public ResponseEntity<Student> findById(@PathVariable("id") Integer id){
		Optional<Student> idDetails = service.fetchById(id);
		return new ResponseEntity<Student>(idDetails.get(),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete-studentby-id/{id}")
	@Operation(summary="Delete Operation", description="This API method would delete the student record based on the ID provided")
	public ResponseEntity<String> deleteStudentRecordById(@PathVariable("id") Integer id){
		String deleteRecord = service.deleteStudentRecordById(id);
		return new ResponseEntity<String>(deleteRecord, HttpStatus.OK);
	}
	
	@PutMapping("/update-student-details")
	@Operation(summary="Put Operation", description="This API method would update the student record based on the new information provided")
	public ResponseEntity<String> upDateStudentRecord(@RequestBody Student student) {
		String record = service.upDateStudentRecord(student);
		return new ResponseEntity<String>(record, HttpStatus.OK);
	}
	
	
	
	
}
