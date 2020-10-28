package org.cap.apps.studentms.service;

import org.cap.apps.studentms.entities.Student;

public interface IStudentService {

    Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);	
}
