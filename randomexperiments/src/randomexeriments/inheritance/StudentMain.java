package randomexeriments.inheritance;

public class StudentMain {
	private Student students[] = new Student[4];// field of StudentMain object

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

		// toString() method to convert object to string, mostly used for debugging to check what object contains
		String eceStudent1String=eceStudent1.toString();
        String cseStudent1String=csStudent1.toString();
        System.out.println(eceStudent1String);
        System.out.println(cseStudent1String);
		ComputerScienceStudent csStudent4=new ComputerScienceStudent(4,"saiteja","dell","java");
		ComputerScienceStudent csStudent5=new ComputerScienceStudent(4,"saiteja","dell","java");
        boolean identity= csStudent4==csStudent5;// return false
		boolean isEqual=csStudent4.equals(csStudent5);
        System.out.println("identity="+identity+" equality="+isEqual);
	}

	public void displayStudents() {
		for (int i=0;i<students.length;i++) {
			Student student=students[i];
			int id = student.getId();
			String name = student.getName();
			System.out.println("student detail is " + id + " " + name);
			boolean isEce=student instanceof ElectronicStudent;
			if(isEce) {
				ElectronicStudent eceStudent=(ElectronicStudent)student;
			    String device= eceStudent.getDevice();
			    System.out.println(" device available "+device);
			}
			boolean isCse=student instanceof ComputerScienceStudent;
			if(isCse) {
				ComputerScienceStudent cseStudent=(ComputerScienceStudent)student;
				String language=cseStudent.getLanguage();
				String laptop=cseStudent.getLaptop();
				System.out.println("laptop is "+laptop+" language is "+language);
			}
		}
	}

}
