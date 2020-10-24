package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.exceptions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.*;

public class StudentDaoImpl implements IStudentDao {

    private EntityManager entityManager;

    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Student save(Student student) {
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student findById(Integer id) {
        Student student = entityManager.find(Student.class, id);
        if (student == null) {
            throw new StudentNotFoundException("student not found for id=" + id);
        }
        return student;
    }

   @Override
    public Student update(Student student) {
        boolean success=checkExists(student.getId());
        if(!success){
            throw new StudentNotFoundException("Can't update, student doesn't exist for id="+student.getId());
        }
        student = entityManager.merge(student);
        return student;
    }

    public boolean checkExists(Integer id){
        Student student = entityManager.find(Student.class, id);
        boolean result= student!=null;
        return result;
    }


    @Override
    public void deleteById(Integer id) {
        Student student = findById(id);
        entityManager.remove(student);
    }


}
