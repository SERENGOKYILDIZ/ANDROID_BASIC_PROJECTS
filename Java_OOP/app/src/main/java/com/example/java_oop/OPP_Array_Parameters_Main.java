package com.example.java_oop;

public class OPP_Array_Parameters_Main {
    public static void main(String[] args)
    {
        Islemler islem = new Islemler();
        double ortalama = islem.ortalama_hesaplama(4,8,7,4,1,5,3,4,6,4,4,4,5);
        System.out.println("Ortalama: " + ortalama);
    }
}
