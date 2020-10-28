package org.cap.apps.studentms.exceptions;

public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException() {
		
	}
	
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
