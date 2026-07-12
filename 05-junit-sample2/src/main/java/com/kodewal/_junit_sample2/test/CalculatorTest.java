package com.kodewal._junit_sample2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kodewal._junit_sample2.Calculator;

// Developer will write all the test cases to check the functionality

public class CalculatorTest {

    @Test
    public void addTwoNumber() {

    	Calculator calculator = new Calculator();

        int expected = 23;  // setting the expectation

        int actual = calculator.doCalculation(10, 13); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
    
    @Test
    public void addTwoNumberWithZero() {

    	Calculator calculator = new Calculator();

        int expected = 13;  // setting the expectation

        int actual = calculator.doCalculation(0, 13); // based on input what method is returning

        assertEquals(expected, actual); //campare the expecteu with actual
    }
}