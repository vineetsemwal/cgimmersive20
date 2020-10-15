package org.cap.apps.studentms.ui;

import org.cap.apps.studentms.entities.*;
import org.cap.apps.studentms.exceptions.InvalidAgeException;
import org.cap.apps.studentms.exceptions.InvalidArgumentException;
import org.cap.apps.studentms.exceptions.InvalidStudentNameException;
import org.cap.apps.studentms.exceptions.StudentNotFoundException;
import org.cap.apps.studentms.service.*;
import org.cap.apps.studentms.exceptions.*;

public class ProjectMain {

	public static void main(String args[]) {
		try {
			ProjectUi ui = new ProjectUi();
			ui.runUi();

		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} catch (InvalidArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InvalidStudentNameException e) {
			System.out.println(e.getMessage());
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());

		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}

	}

}
