package mt.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String args[])throws Exception{
        ExecutorService service= Executors.newCachedThreadPool();
        Callable<Integer>callable=new CallableTask();
        Future<Integer>future =service.submit(callable);
        System.out.println("we will get result in future");
        Integer result=future.get();// here we are getting result . blocking call
        System.out.println("now result is available, result= "+result);
        service.shutdown();
    }
}
