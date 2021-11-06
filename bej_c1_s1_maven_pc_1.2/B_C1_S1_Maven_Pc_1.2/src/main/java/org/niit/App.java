package org.niit;

public class App 
{
    public int sum(int number1,int number2)
    {
        return number1+number2;
    }

    public int minus(int number1,int number2)
    {
        return number1-number2;
    }

    public int multiply(int number1,int number2)
    {
        return number1*number2;
    }

    public int divide(int number1,int number2)
    {
        if(number2==0)
            throw new IllegalArgumentException("can not divided by zero");
        return number1/number2;
    }
}
