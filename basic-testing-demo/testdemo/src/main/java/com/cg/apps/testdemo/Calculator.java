package com.cg.apps.testdemo;

public class Calculator {

    private Adder adder;

    private Subtractor subtractor;

    public Calculator(){}

    public Calculator(Adder adder, Subtractor subtractor){
        this.adder=adder;
        this.subtractor=subtractor;
    }

    public int add(int num1, int num2){
        System.out.println("inside add of caluclator");
       int result= adder.add(num1,num2);
       return result;
    }

    public int subtract(int num1 , int num2){
        int result=subtractor.subtract(num1,num2);
        return result;
    }



}
