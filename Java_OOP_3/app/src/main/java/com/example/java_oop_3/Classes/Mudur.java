package com.example.java_oop_3.Classes;

public class Mudur extends Personel{
    public void iseAl(Personel p){
        p.iseAlindi();
    }
    public void terfiEttir(Personel p){
        if (p instanceof Ogretmen){
            ((Ogretmen) p).maasArttir();
        }
        else if (p instanceof Isci){
           System.out.println("İşçiler terfi olamaz!");
        }

    }
}
