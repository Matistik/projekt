package sk.stuba.fei.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zvysne {
    public static void main(String[] args) {
        System.out.println("by matistikoff\n");
        Scanner keyboard = new Scanner(System.in);
        //program 2a
        //System.out.println("zadaj pocet riadkov: ");
        int riadok = 3;
        System.out.println("zadaj pocet stlpcov: ");
        int stlpec = 5;






        int[] marks = { 125, 132, 95, 116, 110 };




        int[][] mojePole = new int[riadok][stlpec];


        for (int i = 0; i < riadok; i++) {
            for (int j = 0; j < stlpec; j++) {
                if (j<3){
                    mojePole[i][j] =  j+1;

                } else {
                    mojePole[i][j] =  0;
                }
                if(j==3){
                    mojePole[i][3] = mojePole[i][0];

                }
                else if (j==4){
                    mojePole[i][4] = mojePole[i][1];

                }

            }
            System.out.println();
            int Det = (mojePole[0][0] + mojePole[1][1] + mojePole[2][2]);

        }
        System.out.println("vypis matice: \n");
        for (int i = 0; i < mojePole.length; i++) {
            System.out.println();
            for (int j = 0; j < mojePole[i].length; j++){
                System.out.print("  x[" + i + "][" + j + "] = "
                        + mojePole[i][j]);
            }





        }


    }
}






