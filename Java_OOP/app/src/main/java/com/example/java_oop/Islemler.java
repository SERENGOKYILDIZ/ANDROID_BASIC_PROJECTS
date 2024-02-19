package com.example.java_oop;

public class Islemler {
    public double ortalama_hesaplama(double... sayilar) //They can get as many parameters of the same type as we want
    {
        double toplam = 0;
        for(double d:sayilar)
        {
            toplam+=d;
        }
        toplam/=sayilar.length;
        return toplam;
    }
}
