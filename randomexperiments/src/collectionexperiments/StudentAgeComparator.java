package collectionexperiments;

import java.util.*;

import randomexperiments.inheritance.Student;

public class StudentAgeComparator implements Comparator<Student> {

	// int result= comparator.compare(st1, st2);
	@Override
	public int compare(Student student1, Student student2) {
		int age1 = student1.getAge();
		int age2 = student2.getAge();
		int compare = age1 - age2;
		return compare;
	}

}
