package com.example.java_oop_3.Mains;

import com.example.java_oop_3.Classes.AmasyaElmasi;
import com.example.java_oop_3.Classes.Aslan;
import com.example.java_oop_3.Classes.Eatable;
import com.example.java_oop_3.Classes.Elma;
import com.example.java_oop_3.Classes.Squeezable;
import com.example.java_oop_3.Classes.Tavuk;

public class Interface_Main {
    public static void main(String[] args){
        Object aslan = new Aslan();
        Elma elma = new Elma();
        AmasyaElmasi amasyaElmasi = new AmasyaElmasi();
        Eatable tavuk = new Tavuk();

        /*@brief The "Object" class is the class to which all classes are connected.
        That's why we can connect all classes to a single Object array.*/
        Object[] nesneler = new Object[]{aslan, elma, amasyaElmasi, tavuk};

        for(Object obj:nesneler) {
            if(obj instanceof Eatable){
                ((Eatable)obj).howToEat();
            }else if(obj instanceof Squeezable){
                ((Squeezable)obj).howToSqueeze();
            }
        }
    }
}
