package org.cap.apps.studentbootjpa.exceptions;

public class InvalidArgumentException extends RuntimeException {

	public InvalidArgumentException() {

	}

	public InvalidArgumentException(String msg) {
		super(msg);
	}
}
