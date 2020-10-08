package lambda;

public class BiPredicateExample {

    public static void main(String args[]){
        IAddEven expression=(num1,num2)->(num1+num2)%2==0;
        IAddEven block=(num1, num2) -> {
          int sum=num1+num2;
          return sum%2==0;
        };
       boolean isEven1= expression.isAddEven(2,3);
       boolean isEven2=block.isAddEven(3,5);
       System.out.println("from expression "+isEven1);
       System.out.println("from block "+isEven2);
    }
}
