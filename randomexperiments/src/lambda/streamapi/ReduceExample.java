package lambda.streamapi;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String args[]){
       Stream<Integer>stream= Stream.of(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer>operator=(num1,num2)->num1+num2;
        Optional<Integer> optional= stream.reduce(operator);
        if(optional.isPresent()){
            Integer value=optional.get();
            System.out.println("reduced value is "+value);
        }


    }
}
