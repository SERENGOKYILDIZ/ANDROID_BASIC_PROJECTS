package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Array_Exam_Karne {
    public static void main(String[] args)
    {
        String [] dersler = new String[3];
        int [] notlar = new int[dersler.length];
        int ortalama = 0;

        Scanner tarayici = new Scanner(System.in);

        for(int i=0;i<dersler.length;i++)
        {
            System.out.print((i+1) + ". Ders adi: ");
            dersler[i] = tarayici.next();
            System.out.print((i+1) + ". Ders notu: ");
            notlar[i] = tarayici.nextInt();
            ortalama += notlar[i];
        }
        for(int i=0;i<dersler.length;i++)
        {
            System.out.println(dersler[i] + " : " + notlar[i]);
        }
        ortalama /= dersler.length;
        System.out.println("Ortalama : " + ortalama);
        if (ortalama >= 50)
            System.out.println("Tebrikler sınıfı geçtiniz!");
        else
            System.out.println("Sınıfta kaldınız :(");
    }
}
