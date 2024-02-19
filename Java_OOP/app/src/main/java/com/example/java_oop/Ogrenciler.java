package com.example.java_oop;

public class Ogrenciler {
    String isim;
    int okulno;
    String adres;
    public Ogrenciler(String isim, int okulno, String ogrenci_adresi)
    {
        this.isim = isim;
        this.okulno = okulno;
        adres = ogrenci_adresi;
    }
    public void bilgileri_yaz()
    {
        System.out.println("İsim  : " + isim);
        System.out.println("No    : " + okulno);
        System.out.println("Adres : " + adres);
    }
}
