package org.cap.apps.studentbootjparest.bookms.service;

import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.bookms.exceptions.BookNotFoundException;
import org.cap.apps.studentbootjparest.bookms.repository.IBookRepository;
import org.cap.apps.studentbootjparest.studentms.dao.IStudentDao;
import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.cap.apps.studentbootjparest.studentms.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private IStudentDao studentDao;

    @Override
    public Book findById(Long id) {
       Optional<Book>optional= bookRepository.findById(id);
       if(!optional.isPresent()){
           throw new BookNotFoundException("book not found for id="+id);
       }
       return optional.get();
    }

    @Override
    public Book add(String bookName) {
        Book book=new Book();
        book.setBookName(bookName);
        book=bookRepository.save(book);
        return book;
    }

    @Override
    public Book allotToStudent(Long bookId, Integer studentId) {
      Book book=findById(bookId);
      Optional<Student>optionalStudent=studentDao.findById(studentId);
      if(!optionalStudent.isPresent()){
          throw new StudentNotFoundException("student not found for id="+studentId);
      }
      Student student= optionalStudent.get();
      book.setStudent(student);
      book=bookRepository.save(book);
      List<Book> books=student.getBooks();
      if(books==null){
          books=new ArrayList<>();
          student.setBooks(books);
      }
      books.add(book);
      return book;
    }
}
