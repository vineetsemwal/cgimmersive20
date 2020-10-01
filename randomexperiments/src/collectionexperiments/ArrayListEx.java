package collectionexperiments;

import java.util.*;

public class ArrayListEx {

	public static void main(String args[]) {
		List<String> list = new LinkedList<>();
		int count = list.size();
		System.out.println("intial elements count =" + count);
		list.add("shivam");
		list.add("hashil");
		list.add("swati");// element added at index 2
		list.add("vidya");// element add at index 3
		count = list.size();
		System.out.println("4 elements added, count =" + count);

		String elementAtIndex2 = list.get(2);

		list.remove(elementAtIndex2);
		list.remove(1);
		count=list.size();
		System.out.println("removed 2 elements, count =" + count);

		for (String element : list) {
			System.out.println("element=" + element);
		}

	}

}
