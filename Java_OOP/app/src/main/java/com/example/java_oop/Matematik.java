package com.example.java_oop;

public class Matematik {
    public int toplama(int say1, int say2)
    {
        return say1 + say2;
    }
    public int cikartma(int say1, int say2, String isim)
    {
        System.out.println("İşlemi yapan kişi: " + isim);
        return say1 + say2;
    }
    public void carpma(int say1, int say2)
    {
        int sonuc = say1 * say2;
        System.out.println(sonuc);
    }
}
