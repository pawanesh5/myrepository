package org.niit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App calculator;

    @BeforeEach
    public void setUp()
    {
        calculator=new App();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sum()
    {
        assertEquals(4,calculator.sum(2,2));
    }

    @Test
    public void minus()
    {
        assertEquals(0,calculator.minus(5,5));
    }

    @Test
    public void multi()
    {
        assertEquals(20,calculator.multiply(5,4));
    }

    @Test
    public void Divide()
    {
        assertEquals(2,calculator.divide(6,3));
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testDivideByZero()
//    {
//        calculator.divide(6,0);
//    }
}
