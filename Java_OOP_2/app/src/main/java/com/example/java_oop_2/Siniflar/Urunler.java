package com.example.java_oop_2.Siniflar;

public class Urunler {
    String urunAd;
    int urunAdet;
    public Urunler()
    {

    }
    public Urunler(String urunAd, int urunAdet)
    {
        this.urunAd = urunAd;
        this.urunAdet = urunAdet;
    }
    public void setUrunAd(String urunAd)
    {
        this.urunAd = urunAd;
    }
    public void setUrunAdet(int urunAdet)
    {
        this.urunAdet = urunAdet;
    }
    public String getUrunAd()
    {
        return this.urunAd;
    }
    public int getUrunAdet()
    {
        return this.urunAdet;
    }
}
