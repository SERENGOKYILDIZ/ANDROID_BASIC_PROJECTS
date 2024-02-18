package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Loops_For_Exam_Tekrarlama {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String name = tarayici.next();

        System.out.print("Tekrarlanma mikari giriniz:");
        int tekrar = tarayici.nextInt();

        for (int i=1;i<=tekrar;i++)
            System.out.println(name + " - " + i);
    }
}
