package org.cap.apps.studentbootjparest.bookms.service;

import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.studentms.entities.Student;

public interface IBookService {

    Book findById(Long id);

    Book add(String bookName);

    Book allotToStudent(Long bookId, Integer studentId);

}
