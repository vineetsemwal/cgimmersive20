package org.cap.apps.studentbootjparest.dao;

import org.cap.apps.studentbootjparest.entities.Student;

import java.util.List;

public interface IStudentDao {

    Student save(Student student);

    Student findById(Integer id);

    void deleteById(Integer id);

    Student update(Student student);

    List<Student> findAll();

    List<Student> findByName(String name);
}
