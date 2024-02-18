package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Loops_While_Exam_Veri_Isleme {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("İşlenecek veri miktarı giriniz: ");
        int say = tarayici.nextInt();
        int i = say;
        while(say>0)
        {
            System.out.println("veri : " + say);
            say--;
        }
    }
}
