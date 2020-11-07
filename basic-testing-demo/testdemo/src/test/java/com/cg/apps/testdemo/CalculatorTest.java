package com.cg.apps.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    @Test
    public void testAdd_1() {
        Adder adder = Mockito.mock(Adder.class);
        Mockito.when(adder.add(2,3)).thenReturn(5);
        Subtractor subtractor = new Subtractor();
        Calculator calculator = new Calculator(adder, subtractor);
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
        Mockito.verify(adder).add(2,3);
        //shortcut of verifying only one time method has run
        // Mockito.verify(adder,Mockito.times(1)).add(2,3);
        //
    }
}
