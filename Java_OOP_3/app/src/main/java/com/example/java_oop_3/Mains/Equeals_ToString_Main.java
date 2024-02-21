package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.Ogrenci;

public class Equeals_ToString_Main {
    public static void main(String[] args){
        Ogrenci o1 = new Ogrenci(1231, "Ahmet");
        Ogrenci o2 = new Ogrenci(1231, "Mehmet");
        Ogrenci o3 = new Ogrenci(4444, "Zeynep");
        Ogrenci o4 = new Ogrenci(5555, "Ahmet");

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        if(o1.equals(o2)){                      //->Now we can make a comparison
            System.out.println(o1.getIsim() + " ile " + o2.getIsim() + " aynı tclidir.");
        }else{
            System.out.println(o1.getIsim() + " ile " + o2.getIsim() + " farklı tclidir.");
        }
    }
}
