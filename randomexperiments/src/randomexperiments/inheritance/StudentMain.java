package randomexperiments.inheritance;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentMain {
    //map of integer keys and student value
    private Map<Integer, Student> store = new HashMap<>();

    public static void main(String args[]) {
        StudentMain mainObj = new StudentMain();
        mainObj.execute();
    }

    public void execute() {
        ElectronicStudent eceStudent1 = new ElectronicStudent(1, "abhishek", 21, "multimeter");
        ElectronicStudent eceStudent2 = new ElectronicStudent(2, "aniket", 22, "multimeter");
        ComputerScienceStudent csStudent1 = new ComputerScienceStudent(3, "saiteja", 23, "dell", "java");
        ComputerScienceStudent csStudent2 = new ComputerScienceStudent(4, "saksham", 24, "acer", "python");

        // currently keeping ids as keys in map
        store.put(eceStudent1.getId(), eceStudent1);
        store.put(eceStudent2.getId(), eceStudent2);
        store.put(csStudent1.getId(), csStudent1);
        store.put(csStudent2.getId(), csStudent2);
        Student studentFound=findById(2);
        System.out.println("student found  with id 2 "+studentFound.getId()+" "+studentFound.getName());

        displayStudents();


    }


    public Student findById(int id) {
        Student student = store.get(id);
        return student;
    }

    public void displayStudents() {
        System.out.println("displaying all students");
        Collection<Student> values = store.values();
        for (Student student : values) {
            int id = student.getId();
            String name = student.getName();
            System.out.println("student detail is " + id + " " + name);
            boolean isEce = student instanceof ElectronicStudent;
            if (isEce) {
                ElectronicStudent eceStudent = (ElectronicStudent) student;
                String device = eceStudent.getDevice();
                System.out.println(" device available " + device);
            }
            boolean isCse = student instanceof ComputerScienceStudent;
            if (isCse) {
                ComputerScienceStudent cseStudent = (ComputerScienceStudent) student;
                String language = cseStudent.getLanguage();
                String laptop = cseStudent.getLaptop();
                System.out.println("laptop is " + laptop + " language is " + language);
            }
        }
    }

}
