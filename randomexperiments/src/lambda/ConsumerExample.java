package lambda;

public class ConsumerExample {

    public static void main(String args[]){
        IGreet consumer1=new IGreet() {
            @Override
            public void greet(String msg) {
             System.out.println(msg);
            }
        };
        consumer1.greet("welcome to cg training, using anonymous");

        IGreet consumer2=(msg)->System.out.println(msg);
        consumer2.greet("welcome to cg training,using expression");

        IGreet consumer3=(msg)->{
          System.out.println(msg);
        };
        consumer3.greet("welcome to cg training,using block");


    }
}
