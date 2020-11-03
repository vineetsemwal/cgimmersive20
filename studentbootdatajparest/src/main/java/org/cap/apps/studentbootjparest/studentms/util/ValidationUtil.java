package org.cap.apps.studentbootjparest.studentms.util;

import org.cap.apps.studentbootjparest.studentms.exceptions.InvalidAgeException;
import org.cap.apps.studentbootjparest.studentms.exceptions.InvalidArgumentException;
import org.cap.apps.studentbootjparest.studentms.exceptions.InvalidStudentNameException;


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
