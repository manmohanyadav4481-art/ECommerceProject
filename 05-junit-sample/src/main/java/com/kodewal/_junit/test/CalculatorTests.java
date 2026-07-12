package com.kodewal._junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kodewal._junit.Calculator;

// Developer will write all the test cases to check the functionality

public class CalculatorTests {

    @Test
    public void addTwoNumber() {

        Calculator calculator = new Calculator();

        int expected = 23;  // setting the expectation

        int actual = calculator.addTwoNumber(10, 13); // based on input what method is returning

        assertEquals(expected, actual);
    }
}