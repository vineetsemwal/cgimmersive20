package org.cap.apps.studentms.exceptions;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
