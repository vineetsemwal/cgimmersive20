package org.cap.apps.studentbootjparest.dao;

import org.cap.apps.studentbootjparest.entities.Student;
import org.cap.apps.studentbootjparest.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    @Override
    public List<Student> findAll() {
        String ql="from Student";
        TypedQuery<Student>query=entityManager.createQuery(ql,Student.class);
        List<Student>list=query.getResultList();
        return list;
    }

    @Override
    public List<Student> findByName(String name) {
        String ql="from Student where name=:pname";
        TypedQuery<Student>query=entityManager.createQuery(ql,Student.class);
        query.setParameter("pname",name);
        List<Student>list=query.getResultList();
        return list;
    }
}
