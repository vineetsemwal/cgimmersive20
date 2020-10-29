package org.cap.apps.studentbootjpa.exceptions;

public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException() {
		
	}
	
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
