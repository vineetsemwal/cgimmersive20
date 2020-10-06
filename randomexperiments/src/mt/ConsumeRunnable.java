package mt;

public class ConsumeRunnable implements Runnable {

    private ProducerConsumerResource resource;

    public ConsumeRunnable(ProducerConsumerResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            resource.consume();
        }
    }
}
