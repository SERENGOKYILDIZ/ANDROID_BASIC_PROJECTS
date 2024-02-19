package com.example.java_oop;

public class Araba {
    String renk;
    int hiz;
    double uzunluk;
    boolean calisiyor_mu;

    public void calistir()
    {
        this.calisiyor_mu = true;
    }
    public void durdur()
    {
        this.calisiyor_mu = false;
    }
    public void hiz_ayari(int mikar)
    {
        this.hiz = mikar;
    }
    public void hizlan(int mikar)
    {
        this.hiz += mikar;
    }
    public void yavasla(int mikar)
    {
        this.hiz -= mikar;
    }
}
