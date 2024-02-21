package com.example.java_oop_3.Classes;

public class Araba extends Arac {   //->The features of the "vehicle" were transferred to the "Car"
    private String kasaTipi;

    public Araba() {
        super();                                    //->The constructor of the "Arac" works
        System.out.println("=> Araba boş constructor çalıştı");
    }

    public Araba(String kasaTipi) {
        super("Beyaz", "Otomatik");     //->The constructor of the "Arac" works
        this.kasaTipi = kasaTipi;
        System.out.println("=> Araba dolu constructor çalıştı");
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }
    public void bilgi_al_Araba()
    {
        /*@brief "super" is the object of the upper class.*/
        System.out.println("Araba Kasa tipi  : " + kasaTipi);
        System.out.println("Araba renk       : " + super.getRenk());
        System.out.println("Araba vites tipi : " + getVitesTipi());
    }
}
