package org.cap.apps.studentbootjparest.service;

import org.cap.apps.studentbootjparest.dao.*;
import org.cap.apps.studentbootjparest.entities.Student;
import org.cap.apps.studentbootjparest.util.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    private static final Logger Log = LoggerFactory.getLogger(StudentServiceImpl.class);
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
        ValidationUtil.checkArgumentNotNull(student);
        ValidationUtil.checkName(student.getName());
        ValidationUtil.checkAge(student.getAge());
        student = dao.update(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = dao.findAll();
        return list;
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student>students=dao.findByName(name);
        return students;
    }
}
