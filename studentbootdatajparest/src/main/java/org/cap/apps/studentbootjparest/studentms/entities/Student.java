package org.cap.apps.studentbootjparest.studentms.entities;

import org.cap.apps.studentbootjparest.bookms.entities.Book;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Table(name = "students")
@Entity
public class Student {

	@GeneratedValue
	@Id
	private Integer id;
	
	private String firstName,lastName;
	
	private Integer age;

	@OneToMany(mappedBy = "student")
	private List<Book>books;

	public Student() {
		
	}
	
	public Student(String firstName, String lastName, Integer age){
		this.firstName =firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		int hash=Objects.hashCode(id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student that = (Student) obj;
	    return this.id.equals(that.id);
	}
	
	
	
}
