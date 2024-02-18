package com.example.java_standard_program_structures;

public class Comparison_operator {
    public static void main(String[] args)
    {
        int s1 = 60;
        int s2 = 50;
        boolean state = s1 == s2;               //-> state = the condition state
        System.out.println(state);

        int y1 = 70;
        int y2 = 80;
        System.out.println(s1 < s2);
        System.out.println(s1 > s2 && y1 > y2);
        System.out.println(s1 > s2 || y1 > y2);
    }
}
