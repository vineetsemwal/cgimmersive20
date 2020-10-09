package lambda.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String args[]){
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer>incrementedList1=new ArrayList<>();
        for (Integer element:numbers){
          incrementedList1.add(element+1);
        }


        /*
        Stream<Integer> stream=numbers.stream();
        Stream<Integer>incrementedStream=stream.map(e->e+1);
        */
        Consumer<Integer>numberConsumer=System.out::println;
        System.out.println("print element of list incremented by 1");
       numbers.stream().map(e->e+1).collect(Collectors.toList()).forEach(numberConsumer);

    }
}
