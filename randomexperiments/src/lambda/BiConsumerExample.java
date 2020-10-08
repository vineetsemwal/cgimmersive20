package lambda;

public class BiConsumerExample {

    public static void main(String args[]){
        IConcat concat1=new IConcat() {
            @Override
            public void concat(String arg1, String arg2) {
                String msg=arg1 + arg2;
                System.out.println(msg);
            }
        };
        concat1.concat("hello", "world");

        IConcat concat2=(msg1,msg2)->System.out.println(msg1+msg2);
        concat2.concat("good", "evening");

        IConcat concat3=(msg1,msg2)->{
          String result=msg1+msg2;
          System.out.println(result);
        };
        concat3.concat("corona","virus");

    }
}
