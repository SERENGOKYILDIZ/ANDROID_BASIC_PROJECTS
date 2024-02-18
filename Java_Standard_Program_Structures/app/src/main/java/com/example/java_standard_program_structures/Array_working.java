package com.example.java_standard_program_structures;

import java.util.Arrays;

public class Array_working {
    public static void main(String[] args)
    {
        int plakalar[] = new int[5];
        plakalar[0] = 12;
        plakalar[4] = 34;
        System.out.println(Arrays.toString(plakalar));

        String [] meyveler = {"Elma", "Armut", "Şeftali", "Portakal", "Muz", "Vişne"};
        double [] boylar = {1.8, 1.74, 1.54, 2.01};

        System.out.println(Arrays.toString(meyveler));
        meyveler[0] = "Karpuz";
        System.out.println(Arrays.toString(meyveler));
        System.out.println(Arrays.toString(boylar));
        System.out.println(meyveler[4]);
        double boy = boylar[0];
        System.out.println(boy);
    }
}
