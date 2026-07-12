package com.kodewal._junit_sample9.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample9.Calculator;

// Developer will write all the test cases to check the functionality

public class CalculatorTest 
{
	static Calculator calculator;
	
	
	@BeforeAll
	public static void setup ()
	{
		calculator = new Calculator ();
		
		System.out.println("CalculatorTest.setup().........................................");
	}
	
	@AfterAll
	public static void cleanup ()
	{
		calculator = null;
		System.out.println("CalculatorTest.cleanup().......................................");
	}

	@BeforeEach
	public  void before ()
	{
		System.out.println("CalculatorTest.before()........................................");
	}
	
    @Test
    public void addTwoNumber() {
    	
    	System.out.println("CalculatorTest.addTwoNumber()");

    	

        int expected = 23;  // setting the expectation

        int actual = calculator.doCalculation(10, 13); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
    
    @Test
    public void addTwoNumberWithZero() {

    	
        int expected = 13;  // setting the expectation

        int actual = calculator.doCalculation(0, 13); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
    
    @Test
    public void testaddTwoNumberWithBothZero() {

    	
        int expected = 0;  // setting the expectation

        int actual = calculator.doCalculation(0, 0); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
    
    @Test
    public void addTwoNumberWithNegative() {

    	
        int expected = 2;  // setting the expectation

        int actual = calculator.doCalculation(-23, 25); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
    
    @Test
    public void addTwoNumberWithBothNegative() {

    	
        int expected = -25;  // setting the expectation

        int actual = calculator.doCalculation(-23, -2); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
}