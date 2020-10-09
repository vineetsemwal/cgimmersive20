package lambda.streamapi;

import java.util.Optional;

public class OptionalExample {

    public static void main(String args[]){
        Optional<Integer>optional=Optional.of(10);
        if(optional.isPresent()) {
            Integer value = optional.get();
            System.out.println("value="+value);
        }else {
            System.out.println("optional does NOT contain value");
        }
    }
}
