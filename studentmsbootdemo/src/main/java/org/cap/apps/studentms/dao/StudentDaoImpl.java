package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.exceptions.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private Map<Integer, Student> store = new HashMap<>();

	private int generatedId;

	Integer generateId() {
		++generatedId;
		return generatedId;
	}

	@Override
	public Student save(Student student) {
		Integer id = generateId();
		student.setId(id);
		store.put(id, student);
		return student;
	}

	@Override
	public Student findById(Integer id) {
		checkStudentExists(id);
		Student student = store.get(id);
		return student;
	}

	@Override
	public void deleteById(Integer id) {
		checkStudentExists(id);
		store.remove(id);
	}

	public void checkStudentExists(Integer id) {
		Student student = store.get(id);
		if (student == null) {
			throw new StudentNotFoundException("student not found in store for id=" + id);
		}
	}

}
