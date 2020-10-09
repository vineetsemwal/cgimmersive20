package lambda;

public class BiOperatorExample {

    public static void main(String args[]){

        IAdd expression=(num1,num2)->num1+num2;
        IAdd block=(num1, num2) -> {
            return num1+num2;
        };
        int val1=expression.add(2,3);
        int val2=block.add(3,5);
        System.out.println("expression value="+val1);
        System.out.println("block value="+val2);
    }

}
