package org.cap.apps.studentbootjparest.studentms.service;

import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.cap.apps.studentbootjparest.studentms.exceptions.StudentAlreadyExistsException;
import org.cap.apps.studentbootjparest.studentms.exceptions.StudentNotFoundException;
import org.cap.apps.studentbootjparest.studentms.dao.IStudentDao;
import org.cap.apps.studentbootjparest.studentms.util.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    private static final Logger Log = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private IStudentDao dao;


    @Override
    public Student register(Student student) {
        ValidationUtil.checkArgumentNotNull(student);
        ValidationUtil.checkName(student.getFirstName(),student.getLastName());
        ValidationUtil.checkAge(student.getAge());
        boolean exists=student.getId()!=null && dao.existsById(student.getId());
        if(exists){
            throw new StudentAlreadyExistsException("student already exists for id="+student.getId());
        }
        student = dao.save(student);
        return student;
    }


    @Override
    public Student findById(Integer id) {
        Optional<Student> optional = dao.findById(id);
         if(!optional.isPresent()){
             throw new StudentNotFoundException("student not found for id="+id);
         }
         Student student=optional.get();
         return student;
    }

    @Override
    public void deleteById(Integer id) {
        Student student=findById(id);
        dao.delete(student);
    }

    @Override
    public Student update(Student student) {
        ValidationUtil.checkArgumentNotNull(student);
        ValidationUtil.checkName(student.getFirstName(), student.getLastName());
        ValidationUtil.checkAge(student.getAge());
        boolean exists=student.getId()!=null && dao.existsById(student.getId());
        if(!exists){
         throw new StudentNotFoundException("Can't update, student not found for id="+student.getId());
        }
        student = dao.save(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = dao.findAll();
        return list;
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        List<Student>students=dao.findByFirstName(firstName);
        return students;
    }

    @Override
    public List<Student>findByLastName(String lastName){
        List<Student>students=dao.findByLastName(lastName);
        return students;
    }

    @Override
    public List<Student>findByFullName(String firstName, String lastName){
        List<Student>list=dao.findByFullName(firstName, lastName);
        return list;
    }

}
