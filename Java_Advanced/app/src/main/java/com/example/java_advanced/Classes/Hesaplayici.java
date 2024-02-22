package com.example.java_advanced.Classes;

public class Hesaplayici {
    public int bol(int say1, int say2) throws Exception{
        if(say2 == 0)
            throw new Exception("Sıfıra bölünemez!");
        return say1 / say2;
    }
}
