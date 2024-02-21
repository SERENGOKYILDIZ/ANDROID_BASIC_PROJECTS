package com.example.java_oop_2.Siniflar;

public class Renkler {
    /*@brief
    "static final" is like "#define"
    */
    public static final int BEYAZ = 1111;
    public static final int SIYAH = 0000;
    public static final int KIRMIZI = 3333;
    public void boya(int renk)
    {
        if(renk == 1111)
            System.out.println("Beyaz oldu");
        else if(renk == 0000)
            System.out.println("Siyah oldu");
        else if(renk == 3333)
            System.out.println("Kırmızı oldu");
    }
}
