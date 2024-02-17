package com.example.java_variables;

import java.util.Scanner;

public class Console_Input {
    /* @brief We should add "import java.util.Scanner;" */
    public static void main(String args[])
    {
        Scanner tarayici = new Scanner(System.in);      //->This scans the console.

        System.out.print("Lütfen adinizi giriniz: ");
        String gelen_ad = tarayici.next();

        System.out.print("Lütfen yasinizi giriniz: ");
        int gelen_yas = tarayici.nextInt();

        System.out.print("Lütfen boyunuzu giriniz: ");
        double gelen_boy = tarayici.nextDouble();

        System.out.print("Evli misiniz?: ");
        boolean durum = tarayici.nextBoolean();

        System.out.println("Adınız   : " + gelen_ad);
        System.out.println("Yaşınız  : " + gelen_yas);
        System.out.println("Boyunuz  : " + gelen_boy);
        System.out.println("Evli mi? : " + durum);

    }
}
