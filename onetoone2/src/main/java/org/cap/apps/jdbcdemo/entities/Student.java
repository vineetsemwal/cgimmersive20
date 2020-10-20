package org.cap.apps.jdbcdemo.entities;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "students")
@Entity
public class Student {

	@GeneratedValue
	@Id
	private Integer id;
	
	private String name;
	
	private Integer age;

	@OneToOne
	private Address address;

	public Student() {
		
	}
	
	public Student(String name, Integer age, Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
