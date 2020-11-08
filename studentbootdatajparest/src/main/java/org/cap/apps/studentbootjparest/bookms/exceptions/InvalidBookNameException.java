package org.cap.apps.studentbootjparest.bookms.exceptions;


public class InvalidBookNameException extends RuntimeException{
    public InvalidBookNameException(){

    }

    public InvalidBookNameException(String msg){
        super(msg);
    }
}
