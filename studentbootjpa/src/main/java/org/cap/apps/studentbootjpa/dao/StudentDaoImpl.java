package org.cap.apps.studentbootjpa.dao;

import org.cap.apps.studentbootjpa.entities.Student;
import org.cap.apps.studentbootjpa.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StudentDaoImpl implements IStudentDao {
   private static final Logger Log= LoggerFactory.getLogger(StudentDaoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

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
