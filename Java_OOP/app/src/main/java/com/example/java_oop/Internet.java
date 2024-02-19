package com.example.java_oop;

import java.time.Instant;

public class Internet {
    private static final int MAX_GB = 50;
    private static final int EXTRA_FEE = 4;
    public int calculate_salary(int gb)
    {
        int fee = 100;
        if (gb>MAX_GB) {
            fee += (gb-MAX_GB) * EXTRA_FEE;
        }
        else if(gb<MAX_GB)
            System.out.println("Tarife en az " + MAX_GB + "GB'tır!");
        return fee;
    }
}
