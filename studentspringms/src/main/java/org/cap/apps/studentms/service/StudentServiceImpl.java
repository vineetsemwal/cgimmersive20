package org.cap.apps.studentms.service;

import org.cap.apps.studentms.dao.*;
import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao dao;
	
	@Override
	public Student save(Student student) {
	  ValidationUtil.checkArgumentNotNull(student);
	  ValidationUtil.checkName(student.getName()); 
	  ValidationUtil.checkAge(student.getAge());
	  student=	dao.save(student);
	   return student;
	}
	
	

	@Override
	public Student findById(Integer id) {
		Student student=dao.findById(id);
		return student;
	}

	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

}
