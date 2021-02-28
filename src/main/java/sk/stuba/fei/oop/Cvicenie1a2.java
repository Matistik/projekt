package sk.stuba.fei.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cvicenie1a2 {
    public static void main(String[] args) {
        System.out.println("by matistikoff\n");
        Scanner keyboard = new Scanner(System.in);
        //program 2a
        System.out.println("zadaj velkost pola: ");
        int velkost = keyboard.nextInt();
        int[] mojePole = new int[velkost];

        for (int i = 0; i < mojePole.length; i++) {
            System.out.println("zadaj cislo na " + i + " indexe");
            int cislo = keyboard.nextInt();
            mojePole[i] = cislo;
        }
        for (int i = 0; i < mojePole.length;i++){
            System.out.println("cislo na indexe " + i + " je " + mojePole[i]);
        }
        System.out.println("pole sa nachadza na adrese " + mojePole); //vypise adresu pola

    }
}





