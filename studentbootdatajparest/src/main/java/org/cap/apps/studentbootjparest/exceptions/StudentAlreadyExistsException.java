package org.cap.apps.studentbootjparest.exceptions;

public class StudentAlreadyExistsException extends RuntimeException{

    public StudentAlreadyExistsException(){

    }

    public StudentAlreadyExistsException(String msg){
        super(msg);
    }
}
