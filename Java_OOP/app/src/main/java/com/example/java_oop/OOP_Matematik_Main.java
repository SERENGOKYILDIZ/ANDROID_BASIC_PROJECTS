package com.example.java_oop;

public class OOP_Matematik_Main {
    public static void main(String[] args)
    {
        Matematik m1 = new Matematik();
        m1.carpma(3, 5);
        System.out.println("Toplam : " + m1.toplama(5, 7));
        System.out.println("Fark   : " + m1.cikartma(5, 7, "Eren"));
    }
}
