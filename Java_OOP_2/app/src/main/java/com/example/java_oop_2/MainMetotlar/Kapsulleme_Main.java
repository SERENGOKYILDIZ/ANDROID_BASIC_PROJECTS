package com.example.java_oop_2.MainMetotlar;

import com.example.java_oop_2.Siniflar.Ogrenciler;
import com.example.java_oop_2.Siniflar.Urunler;

public class Kapsulleme_Main {
    public static void main(String[] args)
    {
        Ogrenciler o1 = new Ogrenciler();

        o1.setIsim("Ahmet");
        o1.setNo(123);

        System.out.println(o1.getIsim());
        System.out.println(o1.getOkul_no());

        Urunler u1 = new Urunler("Elma", 5);
        System.out.println(u1.getUrunAd());
        System.out.println(u1.getUrunAdet());
    }
}
