package org.cap.apps.studentbootjpa.service;

import org.cap.apps.studentbootjpa.entities.Student;

public interface IStudentService {

    Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);

	Student update(Student student);
}
