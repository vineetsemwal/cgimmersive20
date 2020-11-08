package org.cap.apps.studentbootjparest.bookms.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cap.apps.studentbootjparest.bookms.controllers.BookController;
import org.cap.apps.studentbootjparest.bookms.dto.AddBookRequest;
import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;
import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.bookms.exceptions.BookNotFoundException;
import org.cap.apps.studentbootjparest.bookms.exceptions.InvalidBookNameException;
import org.cap.apps.studentbootjparest.bookms.service.IBookService;
import org.cap.apps.studentbootjparest.bookms.util.BookUtil;
import org.cap.apps.studentbootjparest.studentms.entities.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;
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
     * scenario: book is found
     */
    @Test
    public void testFetchBooks_1() throws Exception {
        long bookId = 100;
        int studentId = 50;
        String firstName = "roshan", lastName = "singh";
        String bookName = "complete reference java";
        int age = 21;
        Book book = mock(Book.class);
        BookDetails bookDetails = new BookDetails();
        bookDetails.setId(bookId);
        bookDetails.setBookName(bookName);
        bookDetails.setStudentId(studentId);
        bookDetails.setFirstName(firstName);
        bookDetails.setLastName(lastName);
        bookDetails.setStudentAge(age);
        when(bookService.findById(bookId)).thenReturn(book);
        when(bookUtil.toBookDetails(book)).thenReturn(bookDetails);
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJson = objectMapper.writeValueAsString(bookDetails);
        System.out.println("inside testFetchBooks_1, expectedJson=" + expectedJson);
        mvc.perform(get("/books/by/id/100")).
                andExpect(status().isOk()).
                andExpect(content().json(expectedJson));
    }

    /**
     * scenario: book is NOT found
     */
    @Test
    public void testFetchBooks_2() throws Exception {
        long bookId = 100;
        String msg = "book not found";
        when(bookService.findById(bookId)).thenThrow(new BookNotFoundException(msg));
        mvc.perform(get("/books/by/id/100")).
                andExpect(status().isNotFound()).
                andExpect(content().string(msg));
    }

    @Test
    public void testAdd_1() throws Exception {
        String bookName = "complete reference java";
        long bookId=78;
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookName(bookName);
        Book book = mock(Book.class);
        when(bookService.add(bookName)).thenReturn(book);
        BookDetails bookDetails = new BookDetails();
        bookDetails.setBookName(bookName);
        bookDetails.setId(bookId);
        when(bookUtil.toBookDetails(book)).thenReturn(bookDetails);
        ObjectMapper objectMapper=new ObjectMapper();
        String requestDataJson=objectMapper.writeValueAsString(addBookRequest);
        String expectedJson=objectMapper.writeValueAsString(bookDetails);
        System.out.println("inside testadd_1, request data json="+requestDataJson);
        System.out.println("inside testadd_1, expected json="+expectedJson);
        mvc.perform(post("/books/add").content(requestDataJson).
                contentType(MediaType.APPLICATION_JSON)).
                andExpect(status().isCreated()).
                andExpect(content().json(expectedJson));
    }

    @Test
    public void testAdd_2() throws Exception{
        String bookName="";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookName(bookName);
        ObjectMapper objectMapper=new ObjectMapper();
        String requestDataJson=objectMapper.writeValueAsString(addBookRequest);
        String msg="invalid book name";
        Mockito.when(bookService.add(bookName)).thenThrow(new InvalidBookNameException(msg));
        mvc.perform(post("/books/add").content(requestDataJson).
                contentType(MediaType.APPLICATION_JSON)).
                andExpect(status().isBadRequest()).
                andExpect(content().string(msg));
    }

}
