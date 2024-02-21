package com.example.java_oop_2.MainMetotlar;

import com.example.java_oop_2.Siniflar.Adresler;
import com.example.java_oop_2.Siniflar.Kisiler;

public class Composition_Main {
    public static void main(String[] args) {
        Adresler adres1 = new Adresler("İstanbul", "Fatih");
        Kisiler k1 = new Kisiler("Eren", 225654, adres1);

        System.out.println("Kişi ad   : " + k1.getIsim());
        System.out.println("Kişi tel  : " + k1.getTel());
        System.out.println("Kişi il   : " + k1.getAdres().getIl());
        System.out.println("Kişi ilce : " + k1.getAdres().getIlce());
    }
}
