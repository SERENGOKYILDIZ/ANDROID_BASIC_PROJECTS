package com.example.java_oop_2.MainMetotlar;

import com.example.java_oop_2.Siniflar.Filmler;
import com.example.java_oop_2.Siniflar.Kategoriler;
import com.example.java_oop_2.Siniflar.Yonetmenler;

public class Composition_Main_2 {
    public static void main(String[] args) {
        Kategoriler kategori1 = new Kategoriler(1, "Dram");
        Kategoriler kategori2 = new Kategoriler(2, "Komedi");
        Kategoriler kategori3 = new Kategoriler(3, "Bilim Kurgu");

        Yonetmenler yonetmen1 = new Yonetmenler(1, "Yılmaz Erdoğan");

        Filmler film = new Filmler(1, "Vizontele", 2009, kategori2, yonetmen1);

        System.out.println("Film id       : " + film.getFilm_id());
        System.out.println("Film ad       : " + film.getFilm_ad());
        System.out.println("Film yıl      : " + film.getFilm_yil());
        System.out.println("Film yonetmen : " + film.getYonetmen().getYonetmen_ad());
        System.out.println("Film kategori : " + film.getKategori().getKategori_ad());
    }
}
