package com.example.java_advanced.Mains;

import com.example.java_advanced.Classes.IkinciThread;

public class Thread_Main {
    public static void main(String[] args){

        Birinci_Thread bt1 = new Birinci_Thread();
        bt1.start();                                    //->For Multitasking

        Thread bt2 = new Thread(new IkinciThread());
        bt2.start();                                    //->For Multitasking

        for(int i=0;i<100;i++){
            System.out.println("Main : " + i);
        }
    }

    static class Birinci_Thread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<100;i++){
                System.out.println("Birinci Thread : " + i);
            }
        }
    }
}
