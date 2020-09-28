
public class StudentMain {
	Student students[] = new Student[4];// field of StudentMain object

	public static void main(String args[]) {
		StudentMain mainObj = new StudentMain();
		mainObj.execute();
	}

	public void execute() {
		ElectronicStudent eceStudent1=new ElectronicStudent(1,"abhishek","multimeter");
		ElectronicStudent eceStudent2=new ElectronicStudent(2,"aniket","multimeter");
		ComputerScienceStudent csStudent1=new ComputerScienceStudent(3,"saiteja","dell","java");
		ComputerScienceStudent csStudent2=new ComputerScienceStudent(4,"saksham","acer","python");
 
		students[0]=eceStudent1;
		students[1]=eceStudent2;
		students[2]=csStudent1;
		students[3]=csStudent2;
		displayStudents();

	}

	public void displayStudents() {
		for (Student iterated : students) {
			int id = iterated.getId();
			String name = iterated.getName();
			System.out.println("student detail is " + id + " " + name);
			boolean isEce=iterated instanceof ElectronicStudent;
			if(isEce) {
				ElectronicStudent eceStudent=(ElectronicStudent)iterated;
			    String device= eceStudent.getDevice();
			    System.out.println(" device available "+device);
			}
			boolean isCse=iterated instanceof ComputerScienceStudent;
			if(isCse) {
				ComputerScienceStudent cseStudent=(ComputerScienceStudent)iterated;
				String language=cseStudent.getLanguage();
				String laptop=cseStudent.getLaptop();
				System.out.println("laptop is "+laptop+" language is "+language);
			}
		}
	}

}
