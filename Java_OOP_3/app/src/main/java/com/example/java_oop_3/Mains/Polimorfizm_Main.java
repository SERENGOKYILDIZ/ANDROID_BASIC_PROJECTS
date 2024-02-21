package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Hayvan;
import com.example.java_oop_3.Classes.Kedi;
import com.example.java_oop_3.Classes.Kopek;
import com.example.java_oop_3.Classes.Memeliler;

public class Polimorfizm_Main {
    public static void main(String[] args){
        Hayvan hayvan1 = new Kedi();
        Hayvan hayvan2 = new Kopek();
        Hayvan hayvan3 = new Memeliler();
        //@brief There are properties of the "Kedi" object inside the "Hayvan" object.
        hayvan1.ses_cikart();            //->It says "Miyav miyav".
        hayvan2.ses_cikart();            //->It says "Hav hav".
    }
}
