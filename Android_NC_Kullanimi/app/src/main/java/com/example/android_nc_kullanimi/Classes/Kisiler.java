package com.example.android_nc_kullanimi.Classes;

import java.io.Serializable;

public class Kisiler implements Serializable {
    String isim;
    int no;

    public Kisiler() {
    }

    public Kisiler(String isim, int no) {
        this.isim = isim;
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
