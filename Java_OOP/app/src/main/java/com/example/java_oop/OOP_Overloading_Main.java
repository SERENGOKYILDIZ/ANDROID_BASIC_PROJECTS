package com.example.java_oop;

public class OOP_Overloading_Main {
    public static void main(String[] args)
    {
        MatematikselHesaplama mh = new MatematikselHesaplama();
        int a = mh.topla(7, 8);
        double b = mh.topla(7, 8.5);
        float c = mh.topla(7.78f, 8.74f);
        int d = mh.topla(10, 20, "eren");
    }
}
