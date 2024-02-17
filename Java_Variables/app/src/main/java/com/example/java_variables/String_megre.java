package com.example.java_variables;

public class String_megre {
    public static void main(String args[])
    {
        String yazi = "Eren";
        String sonuc = yazi + " merhaba";
        System.out.println(sonuc);

        String str = "Kişinin adı" + " Osmandır.";
        System.out.println(str);

        int not = 80;
        String ders = "matematik";
        String metin = "Ali " + ders + " sınavdan " + not + " aldı.";
        System.out.println(metin);

        int sayi1 = 50;
        int sayi2 = 40;
        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: " + sayi2);
        System.out.println("Toplam: " + (sayi1 + sayi2));
    }
}
