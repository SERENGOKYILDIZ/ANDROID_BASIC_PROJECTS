package com.example.java_standard_program_structures;

import java.util.Random;

public class Other_commands {
    public static void main(String[] args)
    {
        System.out.println("Mutlak değer : " + Math.abs(-5));
        System.out.println("PI : " + Math.PI);
        System.out.println("Üslü sayı : " + Math.pow(2,4));
        System.out.println("Köklü sayı : " + Math.sqrt(9));

        Random uret = new Random();

        for(int i=0;i<5;i++)
        {
            System.out.println((i+1) + ". Rastgele sayi : " + uret.nextInt(10));
        }
    }
}
