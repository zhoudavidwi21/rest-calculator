package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1(){
        //Arrange
        int a = 5;
        int b = 6;

        int expected = 11;

        //Act
        int result = calculator.sum(a, b);

        //Assert
        //is expected == result
        assertEquals(expected, result);
    }

    @Test
    void sqrTest1(){
        int a = 2;

        int expected = 4;

        int result = calculator.sqr(a);

        assertEquals(expected, result);
    }

    @Test
    void multiplyTest1(){
        int a = 3;
        int b = 5;

        int expected = 15;

        int result = calculator.multiply(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divisionTest1(){
        int a = 10;
        int b = 2;

        double expected = 5.;

        double result = calculator.division(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divisionTest2(){
        //div by zero
        int a = 5;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.division(a, b);
        });
    }


    @Test
    void absTest1(){
        int a = -4;

        int expected = 4;

        int result = calculator.abs(a);

        assertEquals(expected, result);
    }

    @Test
    void powTest1(){
        int a = 5;
        int b = 3;

        double expected = 125.;

        double result = calculator.pow(a, b);

        assertEquals(expected, result);
    }

    @Test
    void minTest1(){
        int a = 5;
        int b = 10;

        int expected = 5;

        int result = calculator.min(a, b);

        assertEquals(expected, result);
    }

}