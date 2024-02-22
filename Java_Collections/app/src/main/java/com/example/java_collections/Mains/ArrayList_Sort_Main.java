package com.example.java_collections.Mains;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort_Main {
    public static void main(String[] args){
        ArrayList<String> meyveler = new ArrayList<String>();

        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Muz");
        meyveler.add("Portakal");
        meyveler.add("Erik");

        System.out.println("Sıralama öncesi;");
        for (String s:meyveler)
        {
            System.out.print(s + " - ");
        }
        System.out.println();

        Collections.sort(meyveler);

        System.out.println("Sıralama sonrası;");
        for (String s:meyveler)
        {
            System.out.print(s + " - ");
        }
        System.out.println();
    }
}
