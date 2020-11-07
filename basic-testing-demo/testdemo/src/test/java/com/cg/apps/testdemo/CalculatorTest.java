package com.cg.apps.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    @Test
    public void testAdd_1() {
        Adder adder = Mockito.mock(Adder.class);
        Mockito.when(adder.add(2,3)).thenReturn(5);
        Calculator calculator = new Calculator(adder);
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
        Mockito.verify(adder).add(2,3);
        //shortcut of verifying only one time method has run
        // Mockito.verify(adder,Mockito.times(1)).add(2,3);
        //
    }

    @Test
    public void testMultiByTwo_1(){
        Calculator calculator=new Calculator();
        Calculator spy= Mockito.spy(calculator);
        //Mockito.when(spy.multiply(5,2)).thenReturn(10);should not be done int this way here
        Mockito.doReturn(10).when(spy).multiply(5,2);
        int result= spy.multiplyByTwo(5);
        Assertions.assertEquals(10,result);
        Mockito.verify(spy).multiply(5,2);
    }
}
