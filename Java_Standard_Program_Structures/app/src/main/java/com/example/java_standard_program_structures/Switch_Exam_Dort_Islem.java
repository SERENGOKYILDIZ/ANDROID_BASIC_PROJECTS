package com.example.java_standard_program_structures;

import java.util.Scanner;

public class Switch_Exam_Dort_Islem {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Hesaplama seçiniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkartma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");
        int tercih = tarayici.nextInt();

        System.out.print("İlk sayıyı giriniz:    ");
        double num1 = tarayici.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = tarayici.nextDouble();

        switch (tercih)
        {
            case 1:                                     //->The Process is Addition
                System.out.println("Sonuc: " + (num1 + num2));
                break;
            case 2:                                     //->The Process is Subtraction
                System.out.println("Sonuc: " + (num1 - num2));
                break;
            case 3:                                     //->The Process is Multiplication
                System.out.println("Sonuc: " + (num1 * num2));
                break;
            case 4:                                     //->The Process is Division
                System.out.println("Sonuc: " + (num1 / num2));
                break;
            default:
                System.out.println("Unknown process");
                break;
        }
    }
}
