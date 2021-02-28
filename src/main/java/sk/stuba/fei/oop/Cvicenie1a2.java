package sk.stuba.fei.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cvicenie1a2 {
    public static void main(String[] args) {
        System.out.println("by matistikoff\n");
        Scanner keyboard = new Scanner(System.in);
        //program 2b
        int [] pole = new int[] {1,2,3,4,5}; //inicializacia pola
        pole[2] = 10;
        for (int i = 0; i < pole.length;i++){
            System.out.println(pole[i]);
        }
    }
}





