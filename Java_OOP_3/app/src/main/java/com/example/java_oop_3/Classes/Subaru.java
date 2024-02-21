package com.example.java_oop_3.Classes;

public class Subaru extends Araba{
    private String motorHacmi;

    public Subaru() {
        super("Sedan");                     //->The constructor of the "Araba" works
        System.out.println("=> Subaru boş constructor çalıştı");
    }

    public Subaru(String motorHacmi) {
        super();                                    //->The constructor of the "Araba" works
        this.motorHacmi = motorHacmi;
        System.out.println("=> Subaru dolu constructor çalıştı");
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
