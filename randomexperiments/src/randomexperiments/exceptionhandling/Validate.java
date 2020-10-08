package randomexperiments.exceptionhandling;

public class Validate {

    public void validateAge(int age){
        if(age<15){
        throw new AgeException("age should be greater than 15");
        }
    }

}
