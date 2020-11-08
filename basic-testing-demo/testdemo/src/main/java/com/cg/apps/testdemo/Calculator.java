package com.cg.apps.testdemo;

public class Calculator {

    private Adder adder;

    public Calculator(){}

    public Calculator(Adder adder){
        this.adder=adder;
    }

    public int add(int num1, int num2){
        System.out.println("inside add of calculator");
       int result= adder.add(num1,num2);
       return result;
    }

    public int multiply(int num1, int num2){
        System.out.println("inside multiply");
        return num1*num2;
    }

    public int multiplyByTwo(int num){
        System.out.println("inside multiplybytwo");
       int result= multiply(num,2);
       return result;
    }




}
