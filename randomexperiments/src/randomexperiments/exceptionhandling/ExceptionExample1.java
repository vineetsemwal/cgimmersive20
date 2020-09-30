package randomexperiments.exceptionhandling;

import randomexperiments.inheritance.ElectronicStudent;

public class ExceptionExample1 {
	
	public static void main(String args[]) {
		try {
		ExceptionExample1 example=new ExceptionExample1();
		ElectronicStudent student=null;
		example.display(student);
		System.out.println("after display method");
		}catch(InvalidArgumentException e) {
			System.out.println("you are passing invalid arguments");
		}
	}
	
	void display(ElectronicStudent student) {
		if(student==null) {
		InvalidArgumentException e=	new InvalidArgumentException("student is null");	
		throw e;	
		}
		System.out.println("parameter ="+student);
		int id=student.getId();
		String name=student.getName();
		System.out.println("id="+id+" name="+name);
	}
	
	

}
