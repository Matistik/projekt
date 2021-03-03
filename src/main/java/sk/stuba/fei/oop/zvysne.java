package sk.stuba.fei.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zvysne {
    public static void main(String[] args) {
        System.out.println("by matistikoff\n");
        Scanner keyboard = new Scanner(System.in);
        //program 2a
        System.out.println("zadaj pocet riadkov: ");
        int riadok = keyboard.nextInt();
        System.out.println("zadaj pocet stlpcov: ");
        int stlpec = keyboard.nextInt();

        int[][] mojePole = new int[riadok][stlpec];

        for (int i = 0; i < riadok; i++) {
            for (int j = 0; j < stlpec; j++) {
                mojePole[i][j] =  KeyboardInput.readInt("[" + i + "][" + j +"]");

            }
            System.out.println();

        }
        System.out.println("vypis matice: \n");
        for (int i = 0; i < mojePole.length; i++) {
            for (int j = 0; j < mojePole[i].length; j++){
                System.out.println(mojePole[i][j] + " ");
            }



        }


    }
}