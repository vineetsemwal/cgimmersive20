package org.cap.apps.studentbootjpa.exceptions;

public class InvalidStudentNameException extends RuntimeException{
	
	public InvalidStudentNameException() {		
	}
	
	public InvalidStudentNameException(String msg) {
		super(msg);
	}
	
	

}
