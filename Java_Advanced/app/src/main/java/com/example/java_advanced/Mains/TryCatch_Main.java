package com.example.java_advanced.Mains;

public class TryCatch_Main {
    public static void main(String[] args){
        int x=5;
        int y=1;
        int[] dizi = new int[2];

        try {
            System.out.println("Sonuç : " + (x/y));
            System.out.println("İşlem tamam");
            dizi[4] = 8;
        }
        //The method of 1
        /*
        catch (Exception e){
            //e.printStackTrace();
            if(e instanceof ArithmeticException){
                System.out.println("Sayılar 0'a bölünemez");
            }else if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Dizinin boyutunu aştınız");
            }
        }*/
        //The method of 2
        catch (ArithmeticException e){
            System.out.println("Sayılar 0'a bölünemez");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizinin boyutunu aştınız");
        }
        //
    }
}
