package com.example.java_oop;


public class Job_Overtime {
    private static final int WEEKLY_HOURS = 160;
    private static final int EXTRA_SALARY = 10;
    public int calculate_salary(int hours)
    {
        int paid = 1750;
        if (hours>WEEKLY_HOURS) {
            paid += (hours-WEEKLY_HOURS) * EXTRA_SALARY;
        }
        else if(hours<WEEKLY_HOURS)
            System.out.println("Haftalık saaten az çalıştığı için tam maaş alamaz!");
        return paid;
    }
}
