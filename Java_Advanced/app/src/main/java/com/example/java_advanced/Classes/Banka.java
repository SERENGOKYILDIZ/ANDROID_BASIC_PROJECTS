package com.example.java_advanced.Classes;

public class Banka {
    private int bakiye;

    public Banka() {
    }

    public Banka(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraCek(String isim, int tutar) {
        if(tutar > bakiye){
            System.out.println(isim + " : Hesapta para kalmadı");
        }else {
            bakiye -= tutar;
            System.out.println(isim + " : Hesapta kalan para " + bakiye + "TL");
        }
    }
}
