package com.example.java_oop_3.Classes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Ogrenci {
    private int tcno;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @NonNull
    @Override                               //->This runs when you type "System.out.println(o1)"
    public String toString() {
        return "Ogrenci adi : " + isim + ", tco : " + tcno;
    }

    @Override                               //->Now we can make a comparison
    public boolean equals(@Nullable Object obj) {
        if(tcno == ((Ogrenci)obj).getTcno()){
            return true;
        }else{
            return false;
        }
    }
}
