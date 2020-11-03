package org.cap.apps.studentbootjparest.bookms.util;

import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;
import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class BookUtil {

    public BookDetails toBookDetails(Book book){
     BookDetails details=new BookDetails();
     details.setId(book.getId());
     details.setBookName(book.getBookName());
        Student student=book.getStudent();
        if(student!=null) {
            details.setAge(student.getAge());
            details.setFirstName(student.getFirstName());
            details.setLastName(student.getLastName());
            details.setStudentId(student.getId());

        }
        return details;
    }

    public List<BookDetails> toBookDetailsList(Collection<Book>books){
        List<BookDetails>desired=new ArrayList<>();
        for (Book book:books){
          BookDetails details= toBookDetails(book);
          desired.add(details);
        }
        return desired;
    }

}
