
public class StudentMain {
    Student students[]=new Student[2];//field of StudentMain object

	public static void main(String args[] ) {	
		StudentMain mainObj=new StudentMain();
		mainObj.execute();
	}
	
	
	public void execute() {
		Student student1=new Student(1,"shivam");	
		Student student2=new Student(2,"abhishek");
		student2.setName("aniket");
	    students[0]=student1;
	    students[1]=student2;	  
	    displayStudents();
	   
	}
	
	public void displayStudents() {
		for(Student iterated:students)
	    {
			int id=iterated.getId();
			String name=iterated.getName();
			System.out.println("student detail is "+id+ " "+name);
	    }
	}

}
