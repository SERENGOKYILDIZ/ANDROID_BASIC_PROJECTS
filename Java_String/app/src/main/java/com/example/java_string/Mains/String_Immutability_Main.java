package com.example.java_string.Mains;

public class String_Immutability_Main {
    public static void main(String[] args){
        String s1 = "Merhaba Dünya";
        String s2 = s1;
        String s3 = "Merhaba Dünya";
        String s4 = "Merhaba";
        String s5 = s4 + " Dünya";

        /*@brief Are the locations of the 2 variables in memory equal*/
        if(s1 == s2){
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit değil");
        }

        /*@brief Since the contents of the 2 variables are equal,
        java makes both of them equal in memory*/
        if(s1 == s3){
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit değil");
        }

        /*@brief Although the contents of the 2 variables are equal,
        they are not at the same address. Because the initial values are different.*/
        if(s1 == s5){
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit değil");
        }

        /*@brief Although the contents of the 2 variables are equal,
        they are not at the same address. Because the variable "s6" is defined in a new memory field.*/
        String s6 = new String("Merhaba Dünya");
        if(s1 == s6){
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit değil");
        }

        String s7 = "Merhaba";
        String s8 = "MERHABA";

        /*@brief This function controls the content of variables "s7" and "s8"*/
        if(s7.equals(s8)) {
            System.out.println("İçerik aynıdır.");
        }else{
            System.out.println("İçerik farklıdır.");
        }

        /*@brief This function controls the content of the variables "s7" and "s8".
        But regardless of the upper and lower case harmony*/
        if(s7.equalsIgnoreCase(s8)) {
            System.out.println("İçerik aynıdır.");
        }else{
            System.out.println("İçerik farklıdır.");
        }

        /*This class is more efficient*/
        StringBuilder stringToplayici = new StringBuilder();
        stringToplayici.append("Merhaba");
        stringToplayici.append(" Dünya");
        System.out.println(stringToplayici.toString());
    }
}
