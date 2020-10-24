package org.cap.apps.studentms.exceptions;

public class InvalidArgumentException extends RuntimeException {

	public InvalidArgumentException() {

	}

	public InvalidArgumentException(String msg) {
		super(msg);
	}
}
