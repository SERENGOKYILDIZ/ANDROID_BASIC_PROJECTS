package com.example.java_collections.Mains;

import com.example.java_collections.Classes.Adres;
import com.example.java_collections.Classes.Personel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_Homeworks_Main {
    public static void main(String[] args){
        //----------------------------------------------------------------------------------------
        //Homework1
//        ArrayList<Integer> sayilarim = new ArrayList<>();
//        Random uret = new Random();
//        for(int i=0;i<=100;i++)
//        {
//            int rastgele_sayi = uret.nextInt(101); //[0,100]
//            sayilarim.add(rastgele_sayi);
//        }
//        Collections.sort(sayilarim);
//        for (Integer say:sayilarim)
//            System.out.print(say + ", ");
        //----------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------
        //Homework2
//        ArrayList<String> isimler = new ArrayList<>();
//        isimler.add("Eren");
//        isimler.add("Osman");
//        isimler.add("Mehmet");
//        isimler.add("Ali");
//        isimler.add("Kemal");
//
//        Scanner tarayici = new Scanner(System.in);
//        System.out.print("İsim giriniz : ");
//        String giris = tarayici.next();
//        for(String isim:isimler)
//        {
//            if(isim.equalsIgnoreCase(giris)) {
//                System.out.println("Girdiğiniz isim listede mevcuttur.");
//                break;
//            }
//        }
        //----------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------
        //Homework3
//
        //----------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------
        //Homework4
        Scanner tarayici = new Scanner(System.in);
        ArrayList<Personel> personeller = new ArrayList<>();
        for(int i=0;i<5;i++) {
            System.out.println("*****************************");
            System.out.print("Personel adı giriniz  : ");
            String isim = tarayici.nextLine();

            System.out.print("Personel no giriniz   : ");
            int no = tarayici.nextInt();

            System.out.print("Personel il giriniz   : ");
            String il = tarayici.next();

            System.out.print("Personel ilçe giriniz : ");
            String ilce = tarayici.next();

            Adres a = new Adres(il, ilce);
            Personel p = new Personel(no, isim, a);
            personeller.add(p);
            while (!tarayici.nextLine().isEmpty());
        }
        for(Personel p:personeller) {
            System.out.println("*****************************");
            System.out.println("Personel ad   : " + p.getIsim());
            System.out.println("Personel no   : " + p.getNo());
            System.out.println("Personel il   : " + p.getAdres().getIl());
            System.out.println("Personel ilçe : " + p.getAdres().getIlce());
            System.out.println("*****************************");
        }
        //----------------------------------------------------------------------------------------
    }
}
