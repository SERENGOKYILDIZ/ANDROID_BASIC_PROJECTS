package com.example.java_oop_3.Classes;

public class Elma implements Eatable, Squeezable{
    @Override
    public void howToEat() {
        System.out.println("Yıka ve ye");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("Soy ve suyunu çıkart");
    }
}
