package com.example.java_io.Mains;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO_Main {
    public static final String DOSYA_YOL = "C:\\Users\\Eren\\AndroidStudioProjects\\UDEMY\\Java_IO\\";
    public static void main(String[] args){

        ////////////////////////////////////
        //fileWriteYaz();
        //fileReadOku();
        ////////////////////////////////////
        //OutputStreamWrite_Yaz();
        //InputStreamRead_Oku();
        ////////////////////////////////////
        //Buffer_Yaz();
        Buffer_Oku();
        ////////////////////////////////////
    }
    public static void Buffer_Oku(){
        try {
            File dosya = new File(DOSYA_YOL + "dosyaBuffer.txt");
            FileReader fr = new FileReader(dosya);;
            BufferedReader okuyucu = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String satir = "";
            while ((satir = okuyucu.readLine())!=null){
                sb.append(satir+'\n');
            }
            okuyucu.close();
            System.out.println("Okunan : " + sb.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void Buffer_Yaz(){
        try {
            File dosya = new File(DOSYA_YOL + "dosyaBuffer.txt");
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            FileWriter fw = new FileWriter(dosya);
            BufferedWriter yazici = new BufferedWriter(fw);
            yazici.write("ASKFHASDFHSDF3459078134J 0934875N98 98347 598");
            yazici.flush();
            yazici.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void OutputStreamWrite_Yaz(){
        try {
            File dosya = new File(DOSYA_YOL + "dosya.txt");
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(dosya);
            OutputStreamWriter yazici = new OutputStreamWriter(fos, "utf-8");
            yazici.write("Merhaba fos");
            yazici.flush();
            yazici.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void InputStreamRead_Oku(){
        try {
            File dosya = new File(DOSYA_YOL + "dosya.txt");
            FileInputStream fis = new FileInputStream(dosya);
            InputStreamReader okuyucu = new InputStreamReader(fis, "utf-8");
            StringBuilder sp = new StringBuilder();
            int bilgi=0;
            while((bilgi = okuyucu.read()) != -1){
                sp.append((char)bilgi);
            }
            okuyucu.close();
            System.out.println("Okunan : " + sp.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void fileWriteYaz() {
        try {
            File dosya = new File(DOSYA_YOL + "dosya.txt");
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            FileWriter yazici = new FileWriter(dosya);
            yazici.write("Merhaba");
            yazici.flush();
            yazici.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void fileReadOku() {
        try {
            File dosya = new File(DOSYA_YOL + "dosya.txt");
            FileReader okuyucu = new FileReader(dosya);
            StringBuilder sp = new StringBuilder();
            int bilgi=0;
            while((bilgi = okuyucu.read()) != -1){
               sp.append((char)bilgi);
            }
            okuyucu.close();
            System.out.println("Okunan : " + sp.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
