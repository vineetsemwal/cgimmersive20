package org.cap.apps.studentms.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import javax.persistence.*;

import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.exceptions.InvalidStudentNameException;
import org.cap.apps.studentms.exceptions.StudentNotFoundException;
import org.cap.apps.studentms.util.JpaUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.*;

class StudentServiceImplTest {
	
	StudentServiceImpl service;
	
	EntityManager entityManager;
	
	@BeforeEach
	public void setup() {
		service=new StudentServiceImpl();
		JpaUtil jpaUtil=JpaUtil.getInstance();
		entityManager=jpaUtil.getEntityManager();
	}
	
	
	@AfterEach
	public void clear() {
	EntityTransaction transaction=entityManager.getTransaction();	
	transaction.begin();
	Query query=	entityManager.createQuery("delete from Student");
	query.executeUpdate();	
	transaction.commit();
	}

	/**
	 * scenario student was saved successfully
	 * precondition : store is empty
	 */
	@Test
	public void testSave_1(){
		String name="bhuratan";
		int age=21;
		Student student=new Student(name,age);
		student=service.save(student);
		TypedQuery<Student> query=entityManager.createQuery("from Student",Student.class);
		List<Student>list=query.getResultList();
		Assertions.assertEquals(1,list.size());
		Student stored=list.get(0);
		Assertions.assertEquals(name,stored.getName());
		Assertions.assertEquals(age, stored.getAge());
		
	}
	
	/**
	 * scenario: when name is empty
	 * expectation:InvalidStudentNameException is thrown
	 */	
	@Test
	public void testSave_2() {
		String name="";
		int age=21;		
		/*
		Executable executable= new Executable() {
			@Override
			public void execute() throws Throwable {
				Student student=new Student(name,age);				
				student=service.save(student);
			}
			
		};
		*/
		Executable executable=()->{
			Student student=new Student(name,age);				
			student=service.save(student);
			
		};
		
		Assertions.assertThrows(InvalidStudentNameException.class, executable);
		
	}
	
	/**
	 * scenario : student doesn't exist in store for id
	 * expected: StudentNotFoundException is thrown
	 */
	@Test
	public void testFindById_1() {
		Executable executable=()->service.findById(1223);
		Assertions.assertThrows(StudentNotFoundException.class, executable);
				
	}
	
	/**
	 * scenario : student exist in store for id
	 * precondition : add student in the store
	 */
	@Test
	public void testFindById_2() {
		String name="bhuratan";
		int age=21;
		Student student=new Student(name,age);
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);	
		transaction.commit();
		Integer id=student.getId();
		Student actual=service.findById(id);
		Assertions.assertEquals(id, actual.getId());
		Assertions.assertEquals(name, actual.getName());
		Assertions.assertEquals(age, actual.getAge());
		
	}
	
	
}
