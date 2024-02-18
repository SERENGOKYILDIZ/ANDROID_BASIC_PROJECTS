package com.example.java_standard_program_structures;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args)
    {
        String [] isimler = {"Zeynep", "Ali", "Hasan", "Osman", "Eren", "Ece", "İrem", "Şeyma", "Buse"};
        for(String isim:isimler)
            System.out.println(isim);
        System.out.println("=============================");
        Arrays.sort(isimler);
        for(String isim:isimler)
            System.out.println(isim);
        System.out.println("=============================");
        int [] sayilar = {89, 12, 1, 65, 125, 84, 65, 42};
        for(int sayi:sayilar)
            System.out.println(sayi);
        System.out.println("=============================");
        Arrays.sort(sayilar);
        for(int sayi:sayilar)
            System.out.println(sayi);
    }
}
