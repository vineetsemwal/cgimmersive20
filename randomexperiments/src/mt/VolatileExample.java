package mt;

public class VolatileExample {
    VolatileResource resource=new VolatileResource();

    public static void main(String args[]) throws InterruptedException{
        VolatileExample example=new VolatileExample();
        example.execute();

    }


    public void execute() throws InterruptedException{
        Thread thread1=new Thread(new VolatileRunnable(resource));
        thread1.start();
        Thread thread2=new Thread(new VolatileRunnable(resource));
        thread2.start();
        increment();
    }

    public void increment() throws InterruptedException{
        for (int i=10;i<100;i++){
            int result= resource.value +i;
            System.out.println(result);
            Thread.sleep(1000);
        }
    }
}
