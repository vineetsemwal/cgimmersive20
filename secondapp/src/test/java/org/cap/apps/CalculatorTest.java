package org.cap.apps;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	Calculator calculator;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("inside beforeall");
	}
	
	
	@BeforeEach
	public void setup() {
		System.out.println("inside setup");
		calculator=new Calculator();
	}
	
	@AfterEach
	public void teardown() {
		System.out.println("inside teardown");
	
	}

	/**
	 * inputs are 5,7
	 * expected 12
	 */
	@Test
	public void testAdd_1() {
		System.out.println("inside testAdd_1");
		int result=calculator.add(5, 7);
	    Assertions.assertEquals(12, result);
	}
	
	/**
	 * inputs are -3,-5
	 * expected -8
	 */
	@Test
	public void testAdd_2() {
		System.out.println("inside testAdd_2");
		int result=calculator.add(-3, -5);
	    Assertions.assertEquals(-8, result);
	}
	
	
}
