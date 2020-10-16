package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Student;

public interface IStudentDao {
	
	Student save(Student student);
	
	Student findById(Integer id);
	
	void deleteById(Integer id);	

}
