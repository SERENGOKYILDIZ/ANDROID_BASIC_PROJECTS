package com.example.java_oop_2.Siniflar;

public class Ogrenciler {
    private String isim;
    private int okul_no;

    public void setIsim(String isim)
    {
        this.isim = isim;
    }
    public String getIsim()
    {
        return this.isim;
    }
    public void setNo(int no)
    {
        this.okul_no = no;
    }
    public int getOkul_no()
    {
        return this.okul_no;
    }
    public void bilgi_al()
    {
        System.out.println("Öğrenci adı : " + isim);
        System.out.println("Öğrenci no  : " + okul_no);
    }
}
