package com.example.java_oop;

public class OOP_Start {
    public static void main(String[] args)
    {
        //Normal Variable
        int yas = 30;
        //Creating Object
        Araba bwm = new Araba();
        bwm.renk = "Kırmızı";
        bwm.hiz = 200;
        bwm.uzunluk = 2.05;
        bwm.calisiyor_mu = true;

        Araba tofas = new Araba();
        tofas.renk = "Siyah";
        tofas.hiz = 100;
        tofas.uzunluk = 2.45;
        tofas.calisiyor_mu = false;

        System.out.println("BWM'nin rengi = " + bwm.renk);
        System.out.println("Tofaşk'ın rengi = " + tofas.renk);

        Araba reno = new Araba();
        reno.renk = "Sarı";
        reno.hiz = 150;
        reno.uzunluk = 3.45;
        reno.calisiyor_mu = true;

        reno.durdur();
        System.out.println("Reno'nun calisma durumu = " + reno.calisiyor_mu);
        reno.calistir();
        System.out.println("Reno'nun calisma durumu = " + reno.calisiyor_mu);

        System.out.println("Reno'nun hizi = " + reno.hiz);
        reno.hiz_ayari(250);
        System.out.println("Reno'nun hizi = " + reno.hiz);
        reno.hizlan(50);
        System.out.println("Reno'nun hizlanma sonrasi hizi = " + reno.hiz);
        reno.yavasla(70);
        System.out.println("Reno'nun yavaslama sonrasi hizi = " + reno.hiz);

    }
}
