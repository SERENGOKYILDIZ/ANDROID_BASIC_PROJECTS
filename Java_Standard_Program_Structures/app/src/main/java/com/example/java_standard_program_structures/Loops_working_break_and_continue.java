package com.example.java_standard_program_structures;

public class Loops_working_break_and_continue {
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            if (i == 3)
                continue;
            if (i == 6)
                break;
            System.out.println("index : " + i);
        }
    }
}
