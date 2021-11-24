package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddShouldAddPositiveNumbers(){
        int result = Calculator.add(1, 2);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddNegativeNumbers(){
        int result = Calculator.add(-1, -2);

        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddShouldSubtractPositiveNumbers(){
        int result = Calculator.subtract(5, 2);

        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldSubtractNegativeNumbers(){
        int result = Calculator.subtract(-5, -2);

        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddShouldMultiplyPositiveNumbers(){
        int result = Calculator.multiply(3, 2);

        Assert.assertEquals(6, result);
    }

    @Test
    public void testAddShouldMultiplyNegativeNumbers(){
        int result = Calculator.multiply(-3, -2);

        Assert.assertEquals(6, result);
    }

    @Test
    public void testAddShouldDividePositiveNumbers(){
        int result = Calculator.divide(8, 4);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testAddShouldDivideNegativeNumbers(){
        int result = Calculator.divide(-5, -2);

        Assert.assertEquals(2, result);
    }
}
