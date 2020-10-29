package org.cap.apps.studentbootjpa.exceptions;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
