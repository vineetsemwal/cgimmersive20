package concurrentcollecitons;

import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentMapExample {

    public static void main(String args[]){
        ConcurrentMap<Integer,String> map=new ConcurrentHashMap<>();
        map.put(1,"sahitya");
        map.put(2,"avichal");
        map.put(3,"shivam");
        map.put(5,"jay");
      //  map.put(5,"shubank");
        map.putIfAbsent(7,"shubank");//  only adds if there is no value for key 7
        map.remove(5,"shubank");// only removes if value shubank is there for key 5 else not removed
    }
}

