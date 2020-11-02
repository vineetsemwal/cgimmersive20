package org.cap.apps.studentbootjparest.dao;

import org.cap.apps.studentbootjparest.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentDao extends JpaRepository<Student,Integer> {

    List<Student> findByFirstName(String name);


    List<Student> findByLastName(String name);

    @Query("from Student where firstName=:fname and lastName=:lname")
    List<Student>findByFullName(@Param("fname") String firstName, @Param("lname") String lastName);
}
