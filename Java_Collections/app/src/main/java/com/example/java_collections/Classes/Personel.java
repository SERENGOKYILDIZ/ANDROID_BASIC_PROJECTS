package com.example.java_collections.Classes;

public class Personel {
    private int no;
    private String isim;
    private Adres adres;

    public Personel() {
    }

    public Personel(int no, String isim, Adres adres) {
        this.no = no;
        this.isim = isim;
        this.adres = adres;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
