package com.cg.apps.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * use with annotations
 */
@ExtendWith(MockitoExtension.class)
public class CalculatorTest2 {

    @Mock
    Adder adder;

    @Spy
    @InjectMocks// for injecting mocks
    Calculator calculatorSpy;

    @Test
    public void testAdd_1() {
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
        //Mockito.when(spy.multiply(5,2)).thenReturn(10);should not be done in this way here
        Mockito.doReturn(10).when(calculatorSpy).multiply(5,2);
        int result= calculatorSpy.multiplyByTwo(5);
        Assertions.assertEquals(10,result);
        Mockito.verify(calculatorSpy).multiply(5,2);
    }
}
