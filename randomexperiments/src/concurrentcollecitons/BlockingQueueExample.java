package concurrentcollecitons;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String args[]) throws InterruptedException{
        //fixed size blocking queue
        BlockingQueue<String>queue= new ArrayBlockingQueue(2);
        queue.add("avichal");
        System.out.println("before taking element");
        //blocking method , indefinetely blocks if queue is empty
        String element=queue.take();
        System.out.println("element taken out is "+element);
        System.out.println("size="+queue.size());
        queue.add("shivam");
        queue.add("jay");
        System.out.println("two elements added");
        //throws IllegalStateException if queue is full
        //queue.add("bharat");

        //returns false if queue is full, no exception thrown
        boolean offerResult=queue.offer("bharat");
        System.out.println("offerresult="+offerResult);
        //thread will wait indefinately for the space in the queue to add element
        queue.put("bharat");
        System.out.println("after third element added");

    }
}
