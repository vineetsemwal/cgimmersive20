package collectionexperiments;

import java.util.*;

import randomexperiments.inheritance.Student;

public class SortingExample {

	public static void main(String args[]) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(2, "arvind",21));
		list.add(new Student(4, "sahitya",22));
		list.add(new Student(1, "kartikeya",20));
		list.add(new Student(3, "tushar",19));
	//	Comparator<Student> comparator = new StudentIdComparator();
	//	list.sort(comparator);
	   Collections.sort(list);
		for (Student student : list) {
			System.out.println(student.getId() + "-" + student.getName()+"-"+student.getAge());
		}
	}
}
