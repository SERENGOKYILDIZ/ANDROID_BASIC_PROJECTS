package com.example.java_advanced.Mains;

import com.example.java_advanced.Classes.Hesaplayici;

public class TryCatchMethod_Main {
    public static void main(String[] args){
        Hesaplayici hesap = new Hesaplayici();
        try {
            hesap.bol(4, 0);
        }catch (Exception e){
            System.out.println("Nesneden şöyle bir hata çıktı : \"" + e.toString() + "\"");
        }
    }
}
