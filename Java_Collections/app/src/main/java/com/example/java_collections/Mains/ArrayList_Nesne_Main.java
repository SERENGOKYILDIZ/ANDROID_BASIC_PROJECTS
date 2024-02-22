package com.example.java_collections.Mains;

import com.example.java_collections.Classes.Ogrenci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Nesne_Main {
    public static void main(String[] args){
        ArrayList<Ogrenci> nesneler = new ArrayList<Ogrenci>();

        Ogrenci o1 = new Ogrenci(222, "Eren");
        Ogrenci o2 = new Ogrenci(111, "Osman");
        Ogrenci o3 = new Ogrenci(444, "Ali");
        Ogrenci o4 = new Ogrenci(333, "Mehmet");
        Ogrenci o5 = new Ogrenci(555, "Ayşe");

        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);
        nesneler.add(o5);

        for(Ogrenci o:nesneler){
            System.out.println("******************************");
            System.out.println("Ogrenci adi : " + o.getIsim());
            System.out.println("Ogrenci no  : " + o.getOkul_no());
            System.out.println("******************************");
        }

        System.out.println("Tc numarasına göre sıralama;");
        Collections.sort(nesneler);
        for(Ogrenci o:nesneler){
            System.out.println("******************************");
            System.out.println("Ogrenci adi : " + o.getIsim());
            System.out.println("Ogrenci no  : " + o.getOkul_no());
            System.out.println("******************************");
        }
    }
}
