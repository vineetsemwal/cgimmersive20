package mt.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
       int result=0;
        for (int i=0;i<=10;i++){
           result=result+i;
           Thread.sleep(300);
       }

        return result;
    }
}
