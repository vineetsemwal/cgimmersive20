package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Student;
/**
 * repository for CRUD operations for Student 
 * 
 * @author vineet
 *
 */
public interface IStudentDao {
	/**
	 * save student object and return after saving
	 * @param student
	 * @return student
	 */
	Student save(Student student);
	
	/**
	 * fetch student by is
	 * @param id
	 * @return student
	 */
	Student findById(Integer id);
	
	void deleteById(Integer id);	

}
