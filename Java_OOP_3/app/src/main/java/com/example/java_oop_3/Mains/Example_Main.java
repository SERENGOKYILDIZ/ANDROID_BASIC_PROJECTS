package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Isci;
import com.example.java_oop_3.Classes.Mudur;
import com.example.java_oop_3.Classes.Ogretmen;
import com.example.java_oop_3.Classes.Personel;

public class Example_Main {
    public static void main(String[] args){
        Mudur mudur = new Mudur();
        Personel ogretmen = new Ogretmen();
        Personel isci = new Isci();

        mudur.iseAl(ogretmen);
        mudur.iseAl(isci);

        mudur.terfiEttir(ogretmen);
        mudur.terfiEttir(isci);
    }
}
