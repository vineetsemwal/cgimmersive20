package org.cap.apps.studentbootjparest.util;

import org.cap.apps.studentbootjparest.exceptions.*;


public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkName(String firstName , String lastName) {
		if (firstName == null || firstName.isEmpty() || lastName==null|| lastName.isEmpty()) {
			throw new InvalidStudentNameException("name is not valid");
		}

	}

	public static void checkAge(Integer age) {
		if (age == null) {
			throw new InvalidAgeException("age is not valid");
		}
		if (age < 0) {
			throw new InvalidAgeException("age is not valid");

		}
	}

}
