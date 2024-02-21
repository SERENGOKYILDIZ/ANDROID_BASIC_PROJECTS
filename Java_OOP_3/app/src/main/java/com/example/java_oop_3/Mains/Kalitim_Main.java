package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Araba;
import com.example.java_oop_3.Classes.Subaru;

public class Kalitim_Main {
    public static void main(String[] args){

        Araba araba = new Araba();

        araba.setKasaTipi("Sedan");
        araba.setRenk("Kırmızı");
        araba.setVitesTipi("Manuel");

        araba.bilgi_al_Araba();
        System.out.println();

        Subaru subaru = new Subaru("1.6V");
        subaru.setRenk("Mavi");
        subaru.setVitesTipi("Otomatik");
        subaru.setKasaTipi("Sedan");
        subaru.bilgi_al_Araba();
        System.out.println();

        //@brief The constructor of the top class runs first.
        Subaru subaru2 = new Subaru("1.8V");
        System.out.println(subaru2.getKasaTipi());
    }
}
