package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Araba;
import com.example.java_oop_3.Classes.Subaru;

public class Casting_Main {
    public static void main(String[] args){

        //Up Casting
        Subaru subaru1 = new Subaru();
        Araba araba1 = subaru1;

        //Down Casting
        Araba araba2 = new Subaru();
        Subaru subaru2 = (Subaru) araba2;

        if (araba2 instanceof Subaru)
            System.out.println("\nArabamız Subarudur.");

    }
}
