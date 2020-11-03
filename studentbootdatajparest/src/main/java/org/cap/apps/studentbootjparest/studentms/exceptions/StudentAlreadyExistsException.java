package org.cap.apps.studentbootjparest.studentms.exceptions;

public class StudentAlreadyExistsException extends RuntimeException{

    public StudentAlreadyExistsException(){

    }

    public StudentAlreadyExistsException(String msg){
        super(msg);
    }
}
