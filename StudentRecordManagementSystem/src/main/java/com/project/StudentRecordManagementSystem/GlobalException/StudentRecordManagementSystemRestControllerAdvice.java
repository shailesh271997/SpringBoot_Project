package com.project.StudentRecordManagementSystem.GlobalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class StudentRecordManagementSystemRestControllerAdvice {
	
	@ExceptionHandler(StudentRecordNotFoundException.class)
	public ResponseEntity<ErrorDetails> studentNotFoundException(StudentRecordNotFoundException e){
		
		ErrorDetails details = new ErrorDetails("Student Record Invalid", e.getMessage(), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAnyException(Exception e)
	{
		ErrorDetails error=new ErrorDetails("Internal Error ", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
