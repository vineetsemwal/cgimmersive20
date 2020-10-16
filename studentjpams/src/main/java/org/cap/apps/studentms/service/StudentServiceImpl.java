package org.cap.apps.studentms.service;

import org.cap.apps.studentms.dao.*;
import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.util.JpaUtil;
import org.cap.apps.studentms.util.ValidationUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;

    private EntityManager entityManager;

    public StudentServiceImpl() {
        JpaUtil jpaUtil=JpaUtil.getInstance();
        entityManager = jpaUtil.getEntityManager();
        dao = new StudentDaoImpl(entityManager);
    }

    @Override
    public Student save(Student student) {
        ValidationUtil.checkArgumentNotNull(student);
        ValidationUtil.checkName(student.getName());
        ValidationUtil.checkAge(student.getAge());
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        student = dao.save(student);
        transaction.commit();
        return student;
    }


    @Override
    public Student findById(Integer id) {
        Student student = dao.findById(id);
        return student;
    }

    @Override
    public void deleteById(Integer id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        dao.deleteById(id);
        transaction.commit();
    }

    @Override
    public Student update(Student student) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        student=dao.update(student);
        transaction.commit();
        return student;
    }
}
