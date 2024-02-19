package com.example.java_oop;

public class Factorial {
    public double calculate(double num)
    {
        double result = 1;
        for(int i=1;i<=num;i++)
            result *= i;
        return result;
    }
}
