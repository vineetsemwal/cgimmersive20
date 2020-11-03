package org.cap.apps.studentbootjparest.bookms.exceptions;

import org.cap.apps.studentbootjparest.bookms.entities.Book;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(){

    }

    public BookNotFoundException(String msg){
        super(msg);
    }
}
