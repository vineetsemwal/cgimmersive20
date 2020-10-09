package lambda;

public class ProduceExample {

    public static void main(String args[]){
        //anoymous example
        IProduces produces1=new IProduces() {
            @Override
            public String produce() {
                return "welcome to cg immersive training, using anoymous";
            }
        };

        // lambda expression
        IProduces produces2=()->"welcome to cg immersive training, using lambda expression";

        //lambda block
        IProduces produces3=()->{
          String msg="welcome to cg immersive training, using lambda block";
          return msg;
        };
        System.out.println("we have only created lambdas but we have not executed them");
        String anoymousMsg=produces1.produce();
        String expressionMsg=produces2.produce();
        String blockMsg=produces3.produce();
        System.out.println(anoymousMsg);
        System.out.println(expressionMsg);
        System.out.println(blockMsg);
    }
}
