package lambda;

import randomexperiments.inheritance.Student;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MethodReferenceExample {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        BinaryOperator<Integer> creatingLambda = (num1, num2) -> num1 + num2;// creating new definition
        int result1 = creatingLambda.apply(1, 2);
        BinaryOperator<Integer> addReference = calculator::add;//using existing one defined in Calculator
        int result2 = addReference.apply(3, 4);
        UnaryOperator<Integer> doubleReference = calculator::doubleValue;
        int result3 = doubleReference.apply(5);
        Predicate<Integer> evenReference = calculator::isEven;
        boolean isEven = evenReference.test(10);
        Function<String, Integer> function = calculator::length;
        int length = function.apply("capgemini");
        BinaryOperator<Integer> multiplyReference = Calculator::multiply;
        int result4 = multiplyReference.apply(2, 3);
        Comparator<Integer> integerComparator = (num1, num2) -> num1 - num2;
        int compareResult = integerComparator.compare(1, 2);
        BinaryOperator<Integer> existingDefinitionReference = Integer::compareTo;//using existin definition in Integer class
        int result5 = existingDefinitionReference.apply(4, 3);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        System.out.println("result4=" + result4);
        System.out.println("result5=" + result5);
        System.out.println("length="+length);
        System.out.println("compare result="+compareResult);
    }

}
