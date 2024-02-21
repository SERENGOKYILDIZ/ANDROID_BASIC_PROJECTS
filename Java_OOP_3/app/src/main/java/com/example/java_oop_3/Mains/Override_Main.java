package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Hayvan;
import com.example.java_oop_3.Classes.Kedi;
import com.example.java_oop_3.Classes.Kopek;
import com.example.java_oop_3.Classes.Memeliler;

public class Override_Main {
    public static void main(String[] args){
        Hayvan h = new Hayvan();
        h.ses_cikart();

        Memeliler m = new Memeliler();
        m.ses_cikart();

        Kedi kedi = new Kedi();
        kedi.ses_cikart();

        Kopek kopek = new Kopek();
        kopek.ses_cikart();
    }
}
