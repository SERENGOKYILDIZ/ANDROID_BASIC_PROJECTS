package com.example.java_standard_program_structures;

public class Array_and_Loops_working {
    public static void main(String[] args)
    {
        String [] sehirler = {"İstanbul", "İzmir", "Ankara", "Denizli", "Rize"};

        for(int i=0;i<5;i++)
            System.out.println("sehir["+i+"] = " + sehirler[i]);

        String [] markalar = {"apple", "google", "hp"};

        int boyut = markalar.length;
        System.out.println("marka dizisinin boyutu = " + boyut);

        for(int i=0;i<boyut;i++)
            System.out.println("marka["+i+"] = " + markalar[i]);

        String [] isimler = {"Eren", "Osman", "Mehmet", "Ali", "Hasan"};
        for(String isim:isimler)        //->it scans all elements in the array
        {
            System.out.println(isim);
        }

        int [] sayilar = {56, 89, 78, 100, 87};
        for(int sayi:sayilar)        //->it scans all elements in the array
        {
            System.out.println(sayi);
        }
    }
}
