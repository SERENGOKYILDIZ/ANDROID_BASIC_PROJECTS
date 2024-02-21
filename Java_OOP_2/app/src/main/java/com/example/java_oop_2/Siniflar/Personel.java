package com.example.java_oop_2.Siniflar;

public class Personel {
    private String isim;
    private int yas;
    public static int sayac;               //->Global variable for all "Personel"

    /* @brief By typing "sayac++;" into all constructors, we can observe how many of this class
    consists of.*/
    /* @brief Make sure your cursor is within the class.Right-click using your mouse and then select
    Generate as shown in the below image.*/

    public Personel() {
        sayac++;
    }

    public Personel(String isim, int yas) {
        sayac++;
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
