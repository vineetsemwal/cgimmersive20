package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.exceptions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.*;

public class StudentDaoImpl implements IStudentDao {

	private EntityManager entityManager;

	public StudentDaoImpl(EntityManager entityManager){
     this.entityManager=entityManager;
	}

	@Override
	public Student save(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student findById(Integer id) {
		Student student = entityManager.find(Student.class,id);
		if(student==null){
			throw new StudentNotFoundException("student not found for id="+id);
		}
		return student;
	}

	@Override
	public void deleteById(Integer id) {
		Student student=findById(id);
		entityManager.remove(student);
	}


}
