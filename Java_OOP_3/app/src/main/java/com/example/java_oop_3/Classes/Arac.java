package com.example.java_oop_3.Classes;

public class Arac {
    private String renk;
    private String vitesTipi;

    public Arac() {
        super();                                //->The constructor of the "Object" works
        System.out.println("=> Arac boş constructor çalıştı");
    }

    public Arac(String renk, String vitesTipi) {
        super();                                //->The constructor of the "Object" works
        this.renk = renk;
        this.vitesTipi = vitesTipi;
        System.out.println("=> Arac dolu constructor çalıştı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }
}
