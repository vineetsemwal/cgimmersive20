package org.cap.apps.studentbootjparest.bookms.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cap.apps.studentbootjparest.bookms.controllers.BookController;
import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;
import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.bookms.exceptions.BookNotFoundException;
import org.cap.apps.studentbootjparest.bookms.service.IBookService;
import org.cap.apps.studentbootjparest.bookms.util.BookUtil;
import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(BookController.class)
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    IBookService bookService;

    @MockBean
    BookUtil bookUtil;

    /**
     * scaenaio: book is found
     */
    @Test
    public void testFetchBooks_1() throws Exception {
        long bookId = 100;
        int studentId = 50;
        String firstName = "roshan", lastName = "singh";
        String bookName = "complete reference java";
        int age = 21;
        Book book = Mockito.mock(Book.class);
        BookDetails bookDetails=new BookDetails();
        bookDetails.setId(bookId);
        bookDetails.setBookName(bookName);
        bookDetails.setStudentId(studentId);
        bookDetails.setFirstName(firstName);
        bookDetails.setLastName(lastName);
        bookDetails.setStudentAge(age);
        Mockito.when(bookService.findById(bookId)).thenReturn(book);
        Mockito.when(bookUtil.toBookDetails(book)).thenReturn(bookDetails);
        ObjectMapper objectMapper=new ObjectMapper();
        String expectedJson=objectMapper.writeValueAsString(bookDetails);
        System.out.println("expectedJson="+expectedJson);
        mvc.perform(get("/books/by/id/100")).andExpect(status().isOk()).andExpect(content().json(expectedJson));
    }

    /**
     * scaenaio: book is NOT found
     */
    @Test
    public void testFetchBooks_2() throws Exception {
        long bookId = 100;
        String msg="book not found";
        Mockito.when(bookService.findById(bookId)).thenThrow(new BookNotFoundException(msg));
        mvc.perform(get("/books/by/id/100")).andExpect(status().isNotFound()).andExpect(content().string(msg));
    }

}
