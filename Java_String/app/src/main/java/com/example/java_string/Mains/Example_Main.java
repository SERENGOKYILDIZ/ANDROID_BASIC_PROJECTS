package com.example.java_string.Mains;

import java.util.Scanner;

public class Example_Main {
    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Bir karakter dizisi giriniz : ");
        String s1 = tarayici.nextLine();
        System.out.print("Girdiniz dizi : " + s1);
        String ters = "";
        int boyut = s1.length();
        for(int i=boyut;i>0;i--)
        {
            ters+=s1.charAt(i-1);
        }
        System.out.print("Girdiniz dizinin tersi : " + ters);
    }
}
