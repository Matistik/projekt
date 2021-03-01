package sk.stuba.fei.oop;

import sk.stuba.fei.oop.car.Auto;

public class Cvicenie1a2 {
    public static void main(String[] args) {
       Auto skoda = new Auto(80);


       System.out.println("Dotankoval som " + skoda.dotankovat());
       System.out.println(skoda.currentState());



       skoda.drive(100);
        System.out.println("Dotankoval som " + skoda.dotankovat());
        System.out.println(skoda.getStavNadrze());


        skoda.drive(200);


        System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.currentState());


        }
}








