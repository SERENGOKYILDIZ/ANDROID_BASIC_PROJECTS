package com.example.java_string.Mains;

public class String_Methods_Main {
    public static void main(String[] args){
        String s1 = "Merhaba Ali";
        System.out.println("s1                                        : " + s1);
        System.out.println("s1'in 2.indexli harfi                     : " + s1.charAt(2));
        System.out.println("s1'in 8.indexli harfi                     : " + s1.charAt(8));
        System.out.println("s1'in uzunluğu                            : " + s1.length());
        System.out.println("s1'in 'a' harfleri 'ö' oldu               : " + s1.replace('a', 'ö'));
        System.out.println("s1'in [3.7) arasi kesim dzisi             : " + s1.substring(3, 7));
        System.out.println("s1'in tüm harfleri artık küçük harf       : " + s1.toLowerCase());
        System.out.println("s1'in tüm harfleri artık büyük harf       : " + s1.toUpperCase());
        s1 = "      Merhaba Ali     ";
        System.out.println("s1'e boşluklar eklendi                    : " + s1);
        System.out.println("s1'e eklenmiş boşluklar silindi           : " + s1.trim());
        s1 = "Merhaba Ali";
        String[] dizi = s1.split(" ");
        System.out.print("s1 ' ' karakterine göre parçalara ayrıldı : ");
        for (int i=0;i<dizi.length;i++)
        {
            if(i==0)
                System.out.print("[");
            if(i!=dizi.length-1)
                System.out.print(dizi[i] + ", ");
            else
                System.out.print(dizi[i] + "]");
        }
    }
}
