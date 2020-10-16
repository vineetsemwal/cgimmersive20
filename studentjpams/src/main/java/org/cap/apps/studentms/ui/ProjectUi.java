package org.cap.apps.studentms.ui;

import org.cap.apps.studentms.entities.Student;
import org.cap.apps.studentms.service.IStudentService;
import org.cap.apps.studentms.service.StudentServiceImpl;

public class ProjectUi {
	private IStudentService service = new StudentServiceImpl();

	public void runUi() {
		Student student = add("avichal", 21);
		int id1 = student.getId();
		Student student2 = add("harshil", 21);
		int id2 = student2.getId();
		Student student3 = add("bharat", 21);
		int id3 = student3.getId();
		displayUserById(id1);
		displayUserById(id2);
		this.removeStudentById(id3);

	}

	public Student add(String name, Integer age) {
		Student student = new Student(name, age);
		student = service.save(student);
		System.out.println("student added with details, id=" + student.getId() + " name=" + student.getName() + " age="
				+ student.getAge());
		return student;
	}

	public void displayUserById(Integer id) {
		Student student = service.findById(id);
		System.out.println("student fetched with details, id=" + student.getId() + " name=" + student.getName()
				+ " age=" + student.getAge());

	}

	public void removeStudentById(Integer id) {
		service.deleteById(id);
	}
}
