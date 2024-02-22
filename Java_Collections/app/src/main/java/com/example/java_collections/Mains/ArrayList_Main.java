package com.example.java_collections.Mains;

import java.util.ArrayList;

public class ArrayList_Main {
    public static void main(String[] args){
        ArrayList<String> meyveler = new ArrayList<String>();

        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Muz");
        meyveler.add("Portakal");
        meyveler.add("Erik");

        int boyut = meyveler.size();
        System.out.println("Boyut : " + boyut);

        for (String s:meyveler)
        {
            System.out.print(s + " - ");
        }
        System.out.println();

        //meyveler.remove("Muz");     //->Deletes the variable named "Muz".
        //meyveler.remove(2);         //->Deletes 2.indexed variable.

        String meyve = meyveler.get(2);
        System.out.println("2.indexli eleman : " + meyve);

        /*@brief The 1.indexed become "Mandalina". Swipes the others to the right.*/
        meyveler.add(1, "Mandalina");

        /*@brief The 1.indexed become "Avakado" from "Muz".*/
        meyveler.set(3, "Avakado");

        for (String s:meyveler)
        {
            System.out.print(s + " - ");
        }
    }
}
