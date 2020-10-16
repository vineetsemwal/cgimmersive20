package org.cap.apps.studentms.util;

import org.cap.apps.studentms.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidStudentNameException("name is not valid");
		}

	}

	public static void checkAge(Integer age) {
		if (age == null) {
			throw new InvalidAgeException("age is not valid");
		}
		if (age < 18) {
			throw new InvalidAgeException("age is not valid");

		}
	}

}
