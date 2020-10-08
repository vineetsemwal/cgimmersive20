package lambda;

public class OperatorExample {
    public static void main(String args[]){
        INumberDouble expression=num -> num*2;

        INumberDouble block=num -> {
            return num*2;
        };

        int val1=expression.doubleValue(10);
        int val2=block.doubleValue(3);
        System.out.println("expression value="+val1);
        System.out.println("block value="+val2);
    }
}
