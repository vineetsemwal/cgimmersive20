package lambda;

public class Calculator {


    public int add(int a, int b){
        return a+b;
    }
    int doubleValue(int number){
      return number*2;
    }
    boolean isEven(int number){
        return number%2==0;
    }

    public int length(String input){
        return input.length();
    }

    public static int multiply(int num1 ,int num2){
        return num1*num2;
    }
}
