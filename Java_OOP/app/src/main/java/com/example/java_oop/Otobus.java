package com.example.java_oop;

public class Otobus {
    //Variables
    int kapasite;
    int mevcut_yolcular;
    String Nereden;
    String Nereye;

    //Methods
    public void bilgi_al()
    {
        System.out.println("Kapasite     : " + this.kapasite);
        System.out.println("Mevcut Yolcu : " + this.mevcut_yolcular);
        System.out.println("Nereden      : " + this.Nereden);
        System.out.println("Nereye       : " + this.Nereye);
    }
    public void Yolcu_al(int yolcu)
    {
        mevcut_yolcular += yolcu;
        if(mevcut_yolcular > kapasite)
            System.out.println("Otobus dolu");
        else
            System.out.println("Yolcu Sayisi: " + this.mevcut_yolcular);
    }
    public void Yolcu_indir(int yolcu)
    {
        mevcut_yolcular -= yolcu;
        if(mevcut_yolcular < 0)
            System.out.println("Otobus bos");
        else
            System.out.println("Yolcu Sayisi: " + this.mevcut_yolcular);
    }
}
