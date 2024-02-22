package com.example.java_collections.Mains;

import com.example.java_collections.Classes.Ogrenci;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Main {
    public static void main(String[] args){
        HashMap<Integer, String> plaklar = new HashMap<>();
        plaklar.put(16, "Bursa");
        plaklar.put(34, "İstanbul");
        plaklar.put(6, "Ankara");

        System.out.println("'34' anahtarının karşılığı : " + plaklar.get(34));
        System.out.println("'16' anahtarının karşılığı : " + plaklar.get(16));

        Set<Integer> anahtarlar = plaklar.keySet();

        for(Integer i:anahtarlar)
        {
            System.out.println(i + " numaralı şehir : " + plaklar.get(i));
        }

        System.out.println();
        System.out.println();
        HashMap<Integer, Ogrenci> nesneler = new HashMap<>();

        Ogrenci o1 = new Ogrenci(222, "Eren");
        Ogrenci o2 = new Ogrenci(111, "Osman");
        Ogrenci o3 = new Ogrenci(444, "Ali");
        Ogrenci o4 = new Ogrenci(333, "Mehmet");
        Ogrenci o5 = new Ogrenci(555, "Ayşe");

        nesneler.put(o1.getOkul_no(), o1);
        nesneler.put(o2.getOkul_no(), o2);
        nesneler.put(o3.getOkul_no(), o3);
        nesneler.put(o4.getOkul_no(), o4);
        nesneler.put(o5.getOkul_no(), o5);

        Set<Integer> okul_nolari = nesneler.keySet();
        for(Integer no:okul_nolari){
            System.out.println("******************************");
            System.out.println("Ogrenci adi : " + nesneler.get(no).getIsim());
            System.out.println("Ogrenci no  : " + nesneler.get(no).getOkul_no());
            System.out.println("******************************");
        }
    }
}
