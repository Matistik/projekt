package sk.stuba.fei.oop;

import sk.stuba.fei.oop.car.Auto;

public class Cvicenie1a2 {
    public static void main(String[] args) {
       Auto skoda = new Auto();

       skoda.setStavNadrze(100);

       skoda.drive(100);

        System.out.println(skoda.getStavNadrze());

        skoda.drive(220);

        System.out.println(skoda.getStavNadrze());


        }
}








