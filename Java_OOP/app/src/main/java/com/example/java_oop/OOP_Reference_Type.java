package com.example.java_oop;

public class OOP_Reference_Type {
    public static void main(String[] args)
    {
        Ogrenciler ali = new Ogrenciler("Ali", 12, "Kurtuluş mahallesi");
        Ogrenciler mehmet = ali;
        //If this is done, the two objects are kept at the same address.
        // Thus, in any change, both are affected.
        mehmet.isim = "Mehmet";

        ali.bilgileri_yaz();
        mehmet.bilgileri_yaz();
    }
}
