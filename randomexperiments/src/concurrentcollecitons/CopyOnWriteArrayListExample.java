package concurrentcollecitons;

import java.util.List;
import java.util.concurrent.*;

public class CopyOnWriteArrayListExample {

    public static void main(String args[]){
        //when ever there is add or remove on copyonwritearraylist , copy of old internal array will be created
        //and change will be there
        List<String>list=new CopyOnWriteArrayList<>();
        list.add("avichal");
        list.add("jay");
        list.add("bharat");
        list.add("tushar");
        list.add("naresh");


    }
}
