package org.cap.apps.studentbootjparest.service;

import org.cap.apps.studentbootjparest.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentService {

    Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);

	Student update(Student student);

	List<Student>findAll();

	List<Student> findByFirstName(String name);

	List<Student> findByLastName(String name);

	List<Student>findByFullName(String firstName, String lastName);

}