package com.example.java_variables;

public class Type_transformation {
    public static void main(String args[])
    {
        double d = 23.56;
        long l = (long) d;
        int i = (int) l;

        System.out.println("Double deger: " + d);
        System.out.println("Long deger: " + l);
        System.out.println("Int deger: " + i);

        //Int to string
        int sayi = 56;
        String kelime1 = String.valueOf(sayi);          //->This is the default function
        String kelime2 = Integer.toString(sayi);
        String kelime3 = sayi + "";
        System.out.println(kelime1);
        System.out.println(kelime2);
        System.out.println(kelime3);

        //String to int
        String str_num = "65";
        int num1 = Integer.parseInt(str_num);
        int num2 = Integer.valueOf(str_num);
        System.out.println(num1);
        System.out.println(num2);

        //String to float
        String str_flo = "12.45";
        float flo1 = Float.parseFloat(str_flo);
        float flo2 = Float.valueOf(str_flo);
        System.out.println(flo1);
        System.out.println(flo2);

        //Float to string
        float flo = 32.78f;
        String kelime1_flo = String.valueOf(flo);
        String kelime2_flo = Float.toString(flo);
        String kelime3_flo = flo + "";
        System.out.println(kelime1_flo);
        System.out.println(kelime2_flo);
        System.out.println(kelime3_flo);
    }
}
