package mt;

public class VolatileRunnable implements Runnable{

    private VolatileResource resource;

    public VolatileRunnable(VolatileResource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
     resource.value++;
     System.out.println("new value set is "+resource.value);
    }
}
