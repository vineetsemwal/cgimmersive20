package lambda.streamapi;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    public static void main(String args[]){
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        /*
        Stream<Integer> stream1=list.stream();
        Predicate<Integer>predicate=e->e%2==0;
        Stream<Integer>stream2=stream1.filter(predicate);
        Consumer consumer=System.out::println;
        stream2.forEach(consumer);
*/
        //in one line
       list.stream().filter(e->e%2==0).forEach(System.out::println);

    }
}
