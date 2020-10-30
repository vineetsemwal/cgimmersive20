package org.cap.apps.studentbootjparest.service;

import org.cap.apps.studentbootjparest.entities.Student;

import java.util.List;

public interface IStudentService {

    Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);

	Student update(Student student);

	List<Student>findAll();
}
