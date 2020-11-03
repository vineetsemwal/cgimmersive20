package org.cap.apps.studentbootjparest.studentms.service;

import org.cap.apps.studentbootjparest.studentms.entities.Student;

import java.util.List;

public interface IStudentService {

    Student register(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);

	Student update(Student student);

	List<Student>findAll();

	List<Student> findByFirstName(String name);

	List<Student> findByLastName(String name);

	List<Student>findByFullName(String firstName, String lastName);

}
