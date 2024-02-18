package com.example.java_standard_program_structures;

import java.util.Scanner;

public class If_Exam_Alan_Hesabi {
    public static void main(String[] args)
    {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Seçim yapınız");
        System.out.println("(1) Çember alanı");
        System.out.println("(2) Dikdörtgen alanı");
        int secim = tarayici.nextInt();
        if (secim == 1)
        {
            System.out.println("Çember yariçapını giriniz: ");
            double yari_cap = tarayici.nextDouble();
            double alan = 3.14 * yari_cap * yari_cap;
            System.out.println("Çemberin alanı: " + alan);
        }
        else
        {
            System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
            double kisa_kenar = tarayici.nextDouble();
            System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
            double uzun_kenar = tarayici.nextDouble();
            double alan = kisa_kenar * uzun_kenar;
            System.out.println("Dikdörtgenin alanı: " + alan);
        }
    }
}
