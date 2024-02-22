package com.example.java_collections.Mains;

import com.example.java_collections.Classes.Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example_Main {
    public static void main(String[] args){
        boolean devam = true;
        Scanner tarayici = new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        while (devam)
        {
            System.out.print("Öğrenci adı giriniz : ");
            String isim = tarayici.nextLine();

            System.out.print("Öğrenci no giriniz  : ");
            int okul_no = tarayici.nextInt();

            Ogrenci e = new Ogrenci(okul_no, isim);
            ogrenciler.add(e);

            System.out.print("Çıkış için '1', devam etmek için diğer sayılar : ");
            int tercih = tarayici.nextInt();
            if(tercih == 1)
                devam = false;
            while (!tarayici.nextLine().isEmpty());
        }
        for(Ogrenci o:ogrenciler){
            System.out.println("******************************");
            System.out.println("Ogrenci adi : " + o.getIsim());
            System.out.println("Ogrenci no  : " + o.getOkul_no());
            System.out.println("******************************");
        }
    }
}
