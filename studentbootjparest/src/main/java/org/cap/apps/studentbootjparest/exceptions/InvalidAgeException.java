package org.cap.apps.studentbootjparest.exceptions;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
