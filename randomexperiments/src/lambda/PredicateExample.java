package lambda;

public class PredicateExample {

    public static void main(String args[]){
        IEven expression=num->num%2==0;
        IEven block=num->{
           int remainder= num%2;
           return remainder==0;
        };
        boolean isEven1=expression.isEven(10);
        boolean isEven2=block.isEven(7);
        System.out.println("from expression,"+isEven1);
        System.out.println("from block,"+isEven2);
    }
}
