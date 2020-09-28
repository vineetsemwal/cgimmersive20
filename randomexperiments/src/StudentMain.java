
public class StudentMain {
	
	public static void main(String args[] ) {	
		Student student1=new Student(1,"shivam");	
		Student student2=new Student(2,"abhishek");
		student2.setName("aniket");
	    Student students[]=new Student[2];
	    students[0]=student1;
	    students[1]=student2;
		for(int i=0;i <students.length;i++)
	    {
			Student iterated=students[i];
			int id=iterated.getId();
			String name=iterated.getName();
			System.out.println("student detail is "+id+ " "+name);
	    }
		
	}

}
