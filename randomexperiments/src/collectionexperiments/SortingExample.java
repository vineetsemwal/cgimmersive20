package collectionexperiments;

import java.util.*;

import randomexperiments.inheritance.Student;

public class SortingExample {

	public static void main(String args[]) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(2, "arvind"));
		list.add(new Student(4, "sahitya"));
		list.add(new Student(1, "kartikeya"));
		list.add(new Student(3, "tushar"));
		Comparator<Student> comparator = new StudentIdComparator();
		list.sort(comparator);
		for (Student student : list) {
			System.out.println(student.getId() + "-" + student.getName());
		}
	}
}
