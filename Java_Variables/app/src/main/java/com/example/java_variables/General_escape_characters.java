package com.example.java_variables;

public class General_escape_characters {
    public static void main(String args[])
    {
        String yazi = "Mehmet \"80\" notu aldi.";
        String dosya_yolu = "C:\\users\\masaüstü";
        String paragraf = "Merhaba\tNasılsın?";
        String paragraf2 = "Merhaba\nNasılsın?\nİyi misin?\nAdın ne?";

        System.out.println(yazi);
        System.out.println(dosya_yolu);
        System.out.println(paragraf);
        System.out.println(paragraf2);

        //Example
        String example = "Merhaba bu \"android\"\n\teğitimi \\ java \\ dili ile öğreneceğiz.";
        System.out.println(example);
    }
}
