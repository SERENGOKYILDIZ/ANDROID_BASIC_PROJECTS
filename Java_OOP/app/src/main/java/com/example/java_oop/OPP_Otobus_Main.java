package com.example.java_oop;

public class OPP_Otobus_Main {
    public static void main(String[] args)
    {
        Otobus kamilkoc = new Otobus();
        kamilkoc.kapasite = 50;
        kamilkoc.mevcut_yolcular = 40;
        kamilkoc.Nereden = "İstanbul";
        kamilkoc.Nereye = "Denizli";

        Otobus nilufer = new Otobus();
        nilufer.kapasite = 40;
        nilufer.mevcut_yolcular = 35;
        nilufer.Nereden = "Ankara";
        nilufer.Nereye = "Bursa";

        kamilkoc.bilgi_al();
        nilufer.bilgi_al();

        kamilkoc.Yolcu_al(10);
        nilufer.Yolcu_al(10);

        kamilkoc.Yolcu_indir(5);
        nilufer.Yolcu_indir(20);
    }
}
