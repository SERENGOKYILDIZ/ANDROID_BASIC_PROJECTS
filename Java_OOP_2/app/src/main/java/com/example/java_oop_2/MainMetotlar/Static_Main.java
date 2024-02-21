package com.example.java_oop_2.MainMetotlar;

import com.example.java_oop_2.Siniflar.Matematik;
import com.example.java_oop_2.Siniflar.Personel;

public class Static_Main {
    public static void main(String[] args)
    {
        int sonuc = Matematik.topla(12, 12);
        System.out.println("Sonuç : " + sonuc);

        Personel p1 = new Personel("Ahmet", 23);
        Personel p2 = new Personel("Mehmet", 70);
        Personel p3 = new Personel("Ali", 14);
        Personel p4 = new Personel("Ayşe", 25);

        System.out.println("Toplam personel sayısı : " + Personel.sayac);
    }
}
