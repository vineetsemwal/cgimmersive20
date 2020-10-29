package org.cap.apps.studentbootjpa.dao;

import org.cap.apps.studentbootjpa.entities.Student;

public interface IStudentDao {
	
	Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);

	Student update(Student student);
}
