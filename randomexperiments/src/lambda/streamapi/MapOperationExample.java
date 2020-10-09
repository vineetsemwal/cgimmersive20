package lambda.streamapi;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MapOperationExample {

    public static void main(String args[]){
       Stream<String>stream= Stream.of("avichal","sahitya","shivam","tushar","naresh");
      /*
       Function<String,Integer>function=e->e.length();
       Stream<Integer>numberStream= stream.map(function);
        Consumer<Integer>consumer=System.out::println;
       numberStream.forEach(consumer);
       */
        //in one line
        stream.map(e->e.length()).forEach(System.out::println);

    }

}
