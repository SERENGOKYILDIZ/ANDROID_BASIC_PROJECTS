package com.example.java_collections.Mains;

import java.util.HashSet;

public class HashSet_Main {
    public static void main(String[] args){
        HashSet<String> meyveler = new HashSet<>();
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Erik");
        meyveler.add("Portakal");
        meyveler.add("Armut");

        meyveler.remove("Muz");         //->Deletes only according to the content

        meyveler.add("Erik");               //->It doesn't add the same value again

        for(String s:meyveler){
            System.out.print(s + " - ");
        }
    }
}
