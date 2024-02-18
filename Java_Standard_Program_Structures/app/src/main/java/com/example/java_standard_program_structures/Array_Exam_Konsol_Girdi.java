package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Array_Exam_Konsol_Girdi {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);
        int [] sayilar = new int[5];
        for(int i=0;i<sayilar.length;i++)
        {
            System.out.print((i+1) + ".inci sayiyi yaziniz: ");
            sayilar[i] = tarayici.nextInt();
        }
        for(int i=0;i<sayilar.length;i++)
            System.out.println((i+1) + ".inci sayi: " + sayilar[i]);
    }
}
