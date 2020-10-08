package lambda;

public class BiConsumerExample {

    public static void main(String args[]){
        IConcat concat=new IConcat() {
            @Override
            public void concat(String arg1, String arg2) {
                String msg=arg1 + arg2;
                System.out.println(msg);
            }
        };
        concat.concat("hello", "world");

    }
}
