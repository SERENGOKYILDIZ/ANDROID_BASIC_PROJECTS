package com.example.java_standard_program_structures;

public class Loops_working_limit_value {
    public static void main(String[] args)
    {
        //Example 1: [3,6] --> 3,4,5,6
        //For
        for (int k=3; k<7;k++)
            System.out.println("k deger: " + k);
        //While
        int l = 3;
        while(l<7)
        {
            System.out.println("l deger: " + l);
            l++;
        }

        //Example 2: [0, 8] --> 0,2,4,6,8
        //For
        for (int z=0; z<9; z+=2)
            System.out.println("z deger: " + z);
        //While
        int x = 0;
        while(x<9)
        {
            System.out.println("x deger: " + x);
            x+=2;
        }
    }
}
