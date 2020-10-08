package lambda;

public class ConsumerExample {

    public static void main(String args[]){
        IConsumer consumer=new IConsumer() {
            @Override
            public void greet(String msg) {
             System.out.println(msg);
            }
        };
        consumer.greet("welcome to cg training");
    }
}
