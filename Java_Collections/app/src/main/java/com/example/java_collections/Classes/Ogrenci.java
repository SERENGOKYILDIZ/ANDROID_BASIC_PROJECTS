package com.example.java_collections.Classes;

import androidx.annotation.Nullable;

public class Ogrenci implements Comparable<Ogrenci>{
    private int okul_no;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int okul_no, String isim) {
        this.okul_no = okul_no;
        this.isim = isim;
    }

    public int getOkul_no() {
        return okul_no;
    }

    public void setOkul_no(int okul_no) {
        this.okul_no = okul_no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int compareTo(Ogrenci ogrenci) {
        return new Integer(this.okul_no).compareTo(ogrenci.getOkul_no());
    }

    @Override
    public int hashCode() {
        return this.okul_no;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(this.okul_no == ((Ogrenci)obj).okul_no)
            return true;
        else
            return false;
    }
}
