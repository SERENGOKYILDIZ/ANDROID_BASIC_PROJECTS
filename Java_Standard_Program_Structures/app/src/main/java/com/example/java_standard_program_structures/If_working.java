package com.example.java_standard_program_structures;

import java.util.Scanner;

public class If_working {
    public static void main(String[] args)
    {
        int yas = 17;
        String isim = "Ahmet";

        Scanner tarayici = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        isim = tarayici.next();

        System.out.print("Yasinizi giriniz: ");
        yas = tarayici.nextInt();

        if (yas <= 18) {
            System.out.println("Resit degilsiniz");
        } else {
            System.out.println("Resitsiniz");
        }

        if(isim.equals("Ahmet"))                    //->String comparison is performed with this function.
        {
            System.out.println("Merhaba Ahment");
        }
        else if(isim.equals("Eren"))
        {
            System.out.println("Merhaba Eren");
        }
        else
        {
            System.out.println("Sen kimsin!?");
        }

        int sifre = 1234;
        String kullanici_adi = "admin";

        System.out.print("Hesabın kullanıcı adını giriniz: ");
        kullanici_adi = tarayici.next();

        System.out.print("Hesabın şifresini giriniz: ");
        sifre = tarayici.nextInt();

        if (sifre == 1234 && kullanici_adi.equals("admin"))
        {
            System.out.println("Sisteme hos geldiniz!");
        }
        else
        {
            System.out.println("Sen kimsin!?");
        }
    }
}
