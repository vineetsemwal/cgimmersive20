package mt;

public class ProducerConsumerProblem {

    public static void main(String args[]){
     ProducerConsumerResource resource=new ProducerConsumerResource();
     Runnable producerRunnable=new ProduceRunnable(resource);
     Thread producerThread=new Thread(producerRunnable);
     Runnable consumerRunnable=new ConsumeRunnable(resource);
     Thread consumerThread=new Thread(consumerRunnable);
     producerThread.start();
     consumerThread.start();

    }
}
