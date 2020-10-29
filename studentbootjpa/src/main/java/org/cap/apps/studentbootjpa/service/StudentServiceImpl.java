package org.cap.apps.studentbootjpa.service;

import org.cap.apps.studentbootjpa.dao.*;
import org.cap.apps.studentbootjpa.entities.Student;
import org.cap.apps.studentbootjpa.util.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    private static final Logger Log= LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private IStudentDao dao;


    @Override
    public Student save(Student student) {
        ValidationUtil.checkArgumentNotNull(student);
        ValidationUtil.checkName(student.getName());
        ValidationUtil.checkAge(student.getAge());
        student = dao.save(student);
        return student;
    }


    @Override
    public Student findById(Integer id) {
        Student student = dao.findById(id);
        return student;
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Student update(Student student) {
        student=dao.update(student);
        return student;
    }
}
