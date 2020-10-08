package lambda;

public class ConsumerExample {

    public static void main(String args[]){
        IGreet consumer=new IGreet() {
            @Override
            public void greet(String msg) {
             System.out.println(msg);
            }
        };
        consumer.greet("welcome to cg training");
    }
}
