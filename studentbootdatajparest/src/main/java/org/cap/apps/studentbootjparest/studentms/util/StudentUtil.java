package org.cap.apps.studentbootjparest.studentms.util;

import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;
import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.bookms.util.BookUtil;
import org.cap.apps.studentbootjparest.studentms.dto.StudentDetails;
import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class StudentUtil {

    @Autowired
    private BookUtil bookUtil;

    public List<StudentDetails> toDetails(Collection<Student> students) {
        List<StudentDetails> desired = new ArrayList<>();
        for (Student student : students) {
            StudentDetails details = toDetails(student);
            desired.add(details);
        }
        return desired;
    }

    public StudentDetails toDetails(Student student) {
        List<Book>books=student.getBooks();
        List<BookDetails>booksDetail=null;
        if (books!=null)
        {
            booksDetail=bookUtil.toBookDetailsList(books);
        }
        StudentDetails details = new StudentDetails(student.getId(), student.getFirstName(), student.getLastName(), student.getAge(),booksDetail);
        return details;

    }

}
