package org.cap.apps.studentbootjparest.studentms;

import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.cap.apps.studentbootjparest.studentms.exceptions.InvalidArgumentException;
import org.cap.apps.studentbootjparest.studentms.exceptions.InvalidStudentNameException;
import org.cap.apps.studentbootjparest.studentms.exceptions.StudentNotFoundException;
import org.cap.apps.studentbootjparest.studentms.service.IStudentService;
import org.cap.apps.studentbootjparest.studentms.service.StudentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@ExtendWith({SpringExtension.class})
@DataJpaTest
@Import(StudentServiceImpl.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentServiceImplTest {

    @Autowired
    IStudentService service;

    @Autowired
    private EntityManager entityManager;

    /**
     * case: student is successfully added in store
     */
    @Test
    public void testRegister_1(){
        String firstName="jay", lastName="gupta";
        int age=21;
        Student student=new Student(firstName,lastName,age);
        student=service.register(student);
        TypedQuery<Student>query= entityManager.createQuery("from Student",Student.class);
        List<Student>list=query.getResultList();
        Assertions.assertEquals(1,list.size());
        Student stored=list.get(0);
        Assertions.assertEquals(student.getId(),stored.getId());
        Assertions.assertEquals(firstName,stored.getFirstName());
        Assertions.assertEquals(lastName,stored.getLastName());
        Assertions.assertEquals(age,stored.getAge());
    }

    /**
     * scenario: student argument is null
     */
    @Test
    public void testRegister_2(){
        Student student=null;
        Executable executable=()-> service.register(student);
        Assertions.assertThrows(InvalidArgumentException.class,executable);
    }

    /**
     * scenario: when firstname is empty
     */
    @Test
    public void testRegister_3(){
        String firstName="", lastName="gupta";
        int age=21;
        Student student=new Student(firstName,lastName,age);
        Executable executable=()-> service.register(student);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }

    /**
     * scenerio: student exists in the store
     * precondition: student is added to the store
     */
    @Test
    public void testFindById_1(){
        String firstName="jay", lastName="gupta";
        int age=21;
        Student student=new Student(firstName,lastName,age);
        entityManager.persist(student);
        Integer id=student.getId();
        Student result=service.findById(id);
        Assertions.assertEquals(id,result.getId());
        Assertions.assertEquals(firstName,result.getFirstName());
        Assertions.assertEquals(lastName,result.getLastName());
        Assertions.assertEquals(age,result.getAge());
    }

    /**
     * scaberio: student doesn't exist in the store
     */
    @Test
    public void testFindById_2(){
        Executable executable=()->service.findById(23);
        Assertions.assertThrows(StudentNotFoundException.class,executable);
    }


}
