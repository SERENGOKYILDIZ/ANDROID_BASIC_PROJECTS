package com.example.java_advanced.Mains;

import com.example.java_advanced.Classes.Ogrenci;

public class ThreadNesne_Main {
    public static void main(String[] args){

        Ogrenci o = new Ogrenci(123, "Kemal");

        BenimThread is1 = new BenimThread("İlk iş", o);
        is1.start();

        BenimThread is2 = new BenimThread("İkinci iş", o);
        is2.start();
    }
    static class BenimThread extends Thread{
        private String isinAdi;
        private Ogrenci ogrenci;
        public BenimThread(String isinAdi, Ogrenci ogrenci){
            this.isinAdi = isinAdi;
            this.ogrenci = ogrenci;
        }

        @Override
        public void run() {
            ogrenci.bilgiAl(this.isinAdi);
        }
    }
}
