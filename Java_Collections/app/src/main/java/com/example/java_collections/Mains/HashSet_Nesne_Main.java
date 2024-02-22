package com.example.java_collections.Mains;

import com.example.java_collections.Classes.Ogrenci;

import java.util.HashSet;

public class HashSet_Nesne_Main {
    public static void main(String[] args){
        HashSet<Ogrenci> nesneler = new HashSet<>();

        Ogrenci o1 = new Ogrenci(222, "Eren");
        Ogrenci o2 = new Ogrenci(111, "Osman");
        Ogrenci o3 = new Ogrenci(444, "Ali");
        Ogrenci o4 = new Ogrenci(333, "Mehmet");
        Ogrenci o5 = new Ogrenci(555, "Ayşe");
        Ogrenci o6 = new Ogrenci(555, "Buse");

        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);
        nesneler.add(o5);
        nesneler.add(o6);

        for(Ogrenci o:nesneler){
            System.out.println("******************************");
            System.out.println("Ogrenci adi : " + o.getIsim());
            System.out.println("Ogrenci no  : " + o.getOkul_no());
            System.out.println("******************************");
        }
    }
}
