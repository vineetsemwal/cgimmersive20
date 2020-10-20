package org.cap.apps.jdbcdemo.ui;

import org.cap.apps.jdbcdemo.entities.Address;
import org.cap.apps.jdbcdemo.entities.Student;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * 1) Get Entity manager factory
 * 2)create entity manager
 * 3)Start transaction
 * 4)Do Operation
 * 5) commit transaction
 * 6)close entity manager
 */
public class ProjectMain {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-ms");

    public static void main(String args[]) {
        ProjectMain project = new ProjectMain();
        project.execute();
    }

    public void execute() {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Address address1 = new Address("hyderabad", "7/pulla reddy road");
        entityManager.persist(address1);
        Student student1 = new Student("tushar", 21, address1);
        entityManager.persist(student1);
        Integer studentId=student1.getId();
        System.out.println("fetching student");
        Student fetchedStudent=entityManager.find(Student.class,studentId);
        Address fetchedAddress=fetchedStudent.getAddress();
        System.out.println("student details="+fetchedStudent.getId()+" "+fetchedStudent.getAge()+" "+fetchedStudent.getName());
        System.out.println("fetched address="+fetchedAddress.getId()+" "+fetchedAddress.getCity()+" "+fetchedAddress.getLineNumber());
        transaction.commit();
        emf.close();
    }


}
