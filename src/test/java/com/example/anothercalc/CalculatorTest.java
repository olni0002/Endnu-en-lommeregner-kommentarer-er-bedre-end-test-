package com.example.anothercalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void twoPlusThreeShouldEqualFive() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void twoMinusThreeShouldEqualMinusOne() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void twoTimesThreeShouldEqualSix() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void threeDividedByTwoShouldEqualOnePointFive() {
        Calculator calculator = new Calculator();
        assertEquals(1.5, calculator.divide(3, 2));
    }

}
