
public class StudentMain {
	
	public static void main(String args[] ) {	
		Student student1=new Student(1,"shivam");	
		student1.name="shivay";
		Student student2=new Student();
		student2.id=2;
		student2.name="abhishek";
		String name2=student2.getName();
		System.out.println("student 1 detail is "+student1.id+ " "+student1.name);
		System.out.println("student 2 detail is "+student2.id+ " "+student2.name);
		
	}

}
