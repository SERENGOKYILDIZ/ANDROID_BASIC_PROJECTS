package com.example.java_variables;

public class Variable_scope {
    int global_num = 123; //Global variable

    public static void main(String args[])
    {

    }

    public void method1()
    {
        int local_variable = 456; //Local variable
        System.out.println(global_num);
    }
    public void method2()
    {
        global_num = 854;
        System.out.println(global_num);
    }
}
