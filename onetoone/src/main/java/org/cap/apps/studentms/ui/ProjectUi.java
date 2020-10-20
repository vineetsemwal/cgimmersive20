package org.cap.apps.studentms.ui;

import org.cap.apps.studentms.entities.Address;
import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.service.AddressServiceImpl;
import org.cap.apps.studentms.service.IAddressService;
import org.cap.apps.studentms.service.IStudentService;
import org.cap.apps.studentms.service.StudentServiceImpl;

public class ProjectUi {
	private IStudentService service = new StudentServiceImpl();
    private IAddressService addressService=new AddressServiceImpl();


	public void runUi() {
		Address address1=new Address("hyderabad","77/pullareddy road");
		Student student1 = add("avichal", 21,address1);
		int id1 = student1.getId();
		Address address2=new Address("banglore","56/mgroad");
		Student student2 = add("harshil", 21,address2);
		int id2 = student2.getId();
		displayUserById(id1);
		displayUserById(id2);



	}

	public Student update(Integer id,String name,Integer age){
		Student student=service.findById(id);
		student.setName(name);
		student.setAge(age);
		student=service.update(student);
		System.out.println("updated student, id="+id +" name="+name+" age="+age);
		return student;
	}

	public Student add(String name, Integer age, Address address) {
		address=addressService.save(address);
		System.out.println("address added with details id="+address.getId()+" "+address.getCity()+" "+address.getLineNumber());
		Student student = new Student(name, age,address);
		student = service.save(student);
		System.out.println("student added with details, id=" + student.getId() + " name=" + student.getName() + " age="
				+ student.getAge());
		return student;
	}

	public void displayUserById(Integer id) {
		Student student = service.findById(id);
		System.out.println("student fetched with details, id=" + student.getId() + " name=" + student.getName()
				+ " age=" + student.getAge());
		Address address=student.getAddress();
		System.out.println("address="+address.getId()+" "+address.getCity()+" "+address.getLineNumber());

	}

	public void removeStudentById(Integer id) {
		service.deleteById(id);
	}
}
