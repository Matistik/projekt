package sk.stuba.fei.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cvicenie1a2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("hello word");

        int Prve = 5;
        int Druhe = 5;
        System.out.println(porovnaj(Prve,Druhe));

        //horoshop
        int[] Mesiace = {0,1, 32, 61, 92,122,153,183,214,245,275,306,336};
        int i = 0;
        while (i == 0){

            System.out.println("zadaj den: ");
            int Den = keyboard.nextInt();
            System.out.println("Zadaj poradove cislo mesiaca : ");
            int Mesiac = keyboard.nextInt();

            int Horoskop = Mesiace[Mesiac] + Den;
            System.out.println(Horoskop);

             if ((Horoskop >= 20) && (Horoskop <= 49)){
                System.out.println("Vodnar");
            }
             else if ((Horoskop >= 50) && (Horoskop <= 80)){
                 System.out.println("Ryby");
             }
             else if ((Horoskop >= 81) && (Horoskop <= 111)){
                System.out.println("Baran");
            }
            else if ((Horoskop >= 112) && (Horoskop <= 141 )){
                System.out.println("Byk");
            }
            else if ((Horoskop >= 142) && (Horoskop <= 173)){
                System.out.println("Blizenci");
            }
            else if ((Horoskop >= 174) && (Horoskop <= 204)){
                System.out.println("Rak");
            }
            else if ((Horoskop >= 205) && (Horoskop <= 235)){
                System.out.println("Lev");
            }
            else if ((Horoskop >= 236) && (Horoskop <= 266)){
                System.out.println("Panna");
            }
            else if ((Horoskop >= 267) && (Horoskop <= 296)){
                System.out.println("Vahy");
            }
            else if ((Horoskop >= 297) && (Horoskop <= 326)){
                System.out.println("Skorpion");
            }
            else if ((Horoskop >= 327) && (Horoskop <= 356)){
                System.out.println("Strelec");
            }
            else {
                System.out.println("Kozorozec");
            }
            System.out.println("Ak si chceš program zopakovať stlač 1! \nPre ukončenie programu stlač 0!");
            int program = keyboard.nextInt();
            if (program == 0){
                i++;
                System.out.println("Koniec programu");
            }
            else if (program > 1 || program < 0){
                System.out.println("Stlacil si nespravne cislo! \nAk si chceš program zopakovať stlač 1! \nPre ukončenie programu stlač 0!");
            }
        }


    }

    public static int porovnaj(int a, int b) {
        return Integer.compare(a, b);
    }
}


