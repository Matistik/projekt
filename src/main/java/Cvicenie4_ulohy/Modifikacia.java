package Cvicenie4_ulohy;

import sk.stuba.fei.oop.KeyboardInput;

import java.util.ArrayList;
import java.util.Iterator;

public class Modifikacia {

    public static void main(String[] args) {
        //modifikacia

        ArrayList<Integer> modifikacie = new ArrayList<Integer>();
        System.out.println("zadaj pocet cisel: ");
        int cislo = KeyboardInput.readInt();
        int i = 1;
        int cisielko;

        while (i <= cislo) {
            System.out.println("zadaj zadaj cislo na " + i + "mieste: ");
            cisielko = KeyboardInput.readInt();
            modifikacie.add(cisielko);
            i++;
        }

        Iterator<Integer> iterator = modifikacie.iterator();
        while (iterator.hasNext()) {
            var cisla = iterator.next();

            if (cisla > 3){
                iterator.remove();
            }

        }

        for(var prvok : modifikacie) {
            System.out.println(prvok);
        }

        }




            }









