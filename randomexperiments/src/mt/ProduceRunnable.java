package mt;

public class ProduceRunnable implements Runnable {

    private ProducerConsumerResource resource;

    public ProduceRunnable(ProducerConsumerResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce();
        }
    }
}
