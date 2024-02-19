package com.example.java_oop;

public class Petition {
    public void create_petition(String st_name, int st_num, int st_days, String date, String par_name)
    {
        System.out.println("\n\t\t\t\tBursa Anadolu Lisesi Müdürlüğüne,\n");
        System.out.println(st_name + " adlı "
                + st_num + " nolu öğrencinin "
                + st_days + " gün izinli olmasını rica ediyorum.");
        System.out.println("Tarih : " + date);
        System.out.println();
        System.out.println("Ad - Soyad : " + par_name);
    }
}
