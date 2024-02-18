package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Loops_Break_and_Continue_Exam_Tek_ve_Cift_Sayi_Bulma {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı giriniz: ");
            int sayi = tarayici.nextInt();
            if (sayi % 2 == 0)
                System.out.println("Sayı çift");
            else
                System.out.println("Sayı tek");
            System.out.println("Çıkış için (1) giriniz. Devam etmek için diğer sayıları.");
            int tercih = tarayici.nextInt();
            if (tercih == 1) {
                System.out.println("Çıkış yapıldı!");
                break;
            }
        }
    }
}
