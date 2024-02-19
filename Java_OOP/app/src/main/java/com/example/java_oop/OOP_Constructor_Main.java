package com.example.java_oop;

public class OOP_Constructor_Main {
    public static void main(String[] args)
    {
        Ogrenciler ali = new Ogrenciler("Ali", 12, "Kurtuluş mahallesi");
        Ogrenciler mehmet = new Ogrenciler("Mehmet", 78, "Aksaray mahallesi");
        ali.bilgileri_yaz();
        mehmet.bilgileri_yaz();
    }
}
