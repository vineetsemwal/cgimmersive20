package lambda;

import java.util.function.BiFunction;

public class PowerSource {
    public double powCal(int num, int power){
        double result= Math.pow(num,power);
        return result;
    }

    public static void main(String args[]){
        PowerSource s=new PowerSource();
        BiFunction<Integer,Integer,Double>lambda=s::powCal;
        double result=lambda.apply(5,2);
        System.out.println("result="+result);
    }

}
