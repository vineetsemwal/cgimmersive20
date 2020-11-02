package org.cap.apps.studentbootjparest.util;

import org.cap.apps.studentbootjparest.dto.StudentDetails;
import org.cap.apps.studentbootjparest.entities.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class StudentUtil {


    public List<StudentDetails> toDetails(Collection<Student> students) {
        List<StudentDetails> desired = new ArrayList<>();
        for (Student student : students) {
            StudentDetails details = toDetails(student);
            desired.add(details);
        }
        return desired;
    }

    public StudentDetails toDetails(Student student) {
        StudentDetails details = new StudentDetails(student.getId(), student.getFirstName(), student.getLastName(), student.getAge());
        return details;

    }

}
