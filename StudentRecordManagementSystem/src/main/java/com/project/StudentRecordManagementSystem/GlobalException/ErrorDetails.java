package com.project.StudentRecordManagementSystem.GlobalException;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private String status;
	
	private String message;
	
	private LocalDateTime dateTime;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public ErrorDetails(String status, String message, LocalDateTime dateTime) {
		super();
		this.status = status;
		this.message = message;
		this.dateTime = dateTime;
	}

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ErrorDetails [status=" + status + ", message=" + message + ", dateTime=" + dateTime + "]";
	}
	
	

}
