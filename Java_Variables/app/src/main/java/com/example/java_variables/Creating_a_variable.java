package com.example.java_variables;

import android.os.Trace;

public class Creating_a_variable {

    /*
    * Note: If you get an error when you "run" the project, do the following actions;
    * -Open the "gradle.xml" file under the ".idea" folder in the project files.
    * -Add "<option name="delegatedBuild" value="false" />"
    * under the "</option>" line. */

    /* @brief
    If the definition of a variable starts with a capital letter, it is a class.
    If it starts with a lowercase letter, it is "primitive".
    But the expression "String" is a special class. Because it is used as "primitive",
    but it starts with a capital letter.*/

    /* @brief The function below is the main function. */

    /* @brief Some definitions;
    * public = Everyone can access this function.
    * static = Access to this function should be by the class name.*/
    public static void main(String args[])
    {
        //Example 1
        String ogrenci_ad = "Mehmet";
        int ogrenci_yas = 15;
        float ogrenci_boy = 1.78f;
        char ogrenci_harf = 'M';

        System.out.println(ogrenci_yas);

        //Example 2
        int urun_id = 3416;
        String urun_ad = "Kol saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikci = "rolex";

        System.out.println(urun_ad);
        System.out.println(urun_fiyat);

    }
}
