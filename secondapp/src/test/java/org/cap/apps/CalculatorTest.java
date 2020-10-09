package org.cap.apps;

import org.junit.jupiter.api.*;

public class CalculatorTest {

	/**
	 * inputs are 5,7
	 * expected 12
	 */
	@Test
	public void testAdd_1() {
		Calculator calculator=new Calculator();
		int result=calculator.add(5, 7);
	    Assertions.assertEquals(12, result);
	}
	
	/**
	 * inputs are -3,-5
	 * expected -8
	 */
	@Test
	public void testAdd_2() {
		Calculator calculator=new Calculator();
		int result=calculator.add(-3, -5);
	    Assertions.assertEquals(-8, result);
	}
	
	
}
