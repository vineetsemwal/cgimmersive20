package org.cap.apps.studentbootjparest.bookms.controllers;

import org.cap.apps.studentbootjparest.bookms.dto.AddBookRequest;
import org.cap.apps.studentbootjparest.bookms.dto.AllotBookRequest;
import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;
import org.cap.apps.studentbootjparest.bookms.entities.Book;
import org.cap.apps.studentbootjparest.bookms.service.IBookService;
import org.cap.apps.studentbootjparest.bookms.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/books")
@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private BookUtil bookUtil;

    @PostMapping("/add")
    public BookDetails add(@RequestBody AddBookRequest requestData){
       Book book= bookService.add(requestData.getBookName());
       BookDetails bookDetails=bookUtil.toBookDetails(book);
       return bookDetails;
    }

    @GetMapping("/by/id/{id}")
    public BookDetails fetchBook(@PathVariable("id")Long id){
       Book book= bookService.findById(id);
       BookDetails details=bookUtil.toBookDetails(book);
       return details;
    }

    @PutMapping("/allot")
    public BookDetails allot(@RequestBody AllotBookRequest request){
       Book book= bookService.allotToStudent(request.getBookId(), request.getStudentId());
       BookDetails details=bookUtil.toBookDetails(book);
       return details;
    }


}
