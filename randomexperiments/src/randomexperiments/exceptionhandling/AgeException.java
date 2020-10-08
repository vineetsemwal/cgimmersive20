package randomexperiments.exceptionhandling;

public class AgeException extends RuntimeException{

    public AgeException(){

    }

    public AgeException(String msg){
        super(msg);
    }
}
