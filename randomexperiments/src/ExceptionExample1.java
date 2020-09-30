
public class ExceptionExample1 {
	
	public static void main(String args[]) {
		ExceptionExample1 example=new ExceptionExample1();
		ElectronicStudent student=null;
		example.display(student);
		System.out.println("after display method");
	}
	
	void display(ElectronicStudent student) {
		try {
		System.out.println("parameter ="+student);
		int id=student.getId();
		String name=student.getName();
		System.out.println("id="+id+" name="+name);
		}catch(NullPointerException e) {
			System.out.println("student is null so didnt display details");
		}
	}

}
