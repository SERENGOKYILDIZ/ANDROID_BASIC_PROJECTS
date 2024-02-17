package com.example.java_variables;

public class Arithmetic_operations {
    public static void main(String args[])
    {
        double daireAlani;
        double pi = 3.14;
        int yaricap = 2;
        daireAlani = pi * yaricap * yaricap;
        System.out.println("Daire alani: " + daireAlani);

        //Example 1
        int kuvvet;
        int kutle = 67;
        int ivme = 10;
        kuvvet = kutle * ivme;
        System.out.println("Kuvvet: " + (kuvvet));

        //Example 2
        int x1;
        int x2;
        int v = 30;
        int v0 = 40;
        int t = 5;
        int a = 2;
        x1 = ((v+v0)/2)*t;
        System.out.println("X1: " + x1);
        x2 = (v0*t) + (a*t*t)/2;
        System.out.println("X2: " + x2);

        int x = 2;
        int z = x++;
        int y = x--;
        System.out.println("Sonuclar1 (x, y, z): " + x + ", " + y + ", " + z + " ");

        int x3 = 2;
        int z2 = ++x3;
        int y2 = --x3;
        System.out.println("Sonuclar2 (x, y, z): " + x3 + ", " + y2 + ", " + z2 + " ");
    }
}
