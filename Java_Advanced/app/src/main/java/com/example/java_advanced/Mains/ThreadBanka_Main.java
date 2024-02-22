package com.example.java_advanced.Mains;

import com.example.java_advanced.Classes.Banka;

public class ThreadBanka_Main {
    public static void main(String[] args){
        Banka banka1 = new Banka(900);
        BankaIslemThread is1 = new BankaIslemThread(banka1, "Ali", 500);
        BankaIslemThread is2 = new BankaIslemThread(banka1, "Zeynep", 600);
        is1.start();
        is2.start();
    }
    static class BankaIslemThread extends Thread{
        private Banka banka;
        private String isim;
        private int tutar;
        public BankaIslemThread(Banka banka, String isim, int tutar)
        {
            this.banka = banka;
            this.isim = isim;
            this.tutar = tutar;
        }
        @Override
        public synchronized void run() {                //->The method was better with "synchronized"
            try {
                Thread.sleep(100);
                banka.paraCek(isim, tutar);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
