package com.example.java_oop;

public class Letter_Finder {
    public int finder(String word, char letter)
    {
        int sonuc = 0;
        for (int i=0;i<word.length();i++)
        {
            if (word.charAt(i) == letter)
                sonuc++;
        }
        return sonuc;
    }
}
