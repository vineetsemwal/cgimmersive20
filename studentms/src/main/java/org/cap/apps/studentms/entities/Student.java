package org.cap.apps.studentms.entities;

import java.util.Objects;

public class Student {

	private Integer id;
	
	private String name;
	
	private Integer age;

	public Student() {
		
	}
	
	public Student(String name, Integer age){
		this.name=name;
		this.age=age;
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
