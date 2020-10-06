package mt;

public class ProducerConsumerResource {
  private   int i=0;
  private boolean isProduced;

   synchronized public void produce(){
       try {
           if(isProduced){
               wait();
           }
           i++;
           Thread.sleep(1000);
           System.out.println("produce " + i);
           isProduced=true;
           notify();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

   synchronized public void consume(){
       try {
           if(!isProduced){
               wait();
           }
           Thread.sleep(1000);
           System.out.println("consume" + i);
           isProduced=false;
           notify();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
