package com.example.android_c_activiylerarasiveritasima.Classes;

import java.io.Serializable;

public class Kisiler implements Serializable {
    String isim;
    int num;
    double boy;

    public Kisiler() {
    }

    public Kisiler(String isim, int num, double boy) {
        this.isim = isim;
        this.num = num;
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
