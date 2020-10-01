package collectionexperiments;

import java.util.*;

import randomexperiments.inheritance.Student;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		int id1 = student1.getId();
		int id2 = student2.getId();
		int compare = id1 - id2;
		return compare;
	}

}
