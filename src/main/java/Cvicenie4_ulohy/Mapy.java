package Cvicenie4_ulohy;
import sk.stuba.fei.oop.KeyboardInput;

import java.util.*;
class Mapy {
    public static void main(String[] args) {




        Map<String, String> hm = new HashMap<>();
        Map<String, String> hm2 = new HashMap<>();

        hm.put("ano" , "yes");
        hm.put("oko" , "eyes");
        hm.put("nie" , "no");
        hm.put("objektovo orientovanie programovanie" , "objected oriented programming");

        hm2.put("ano" , "yes");
        hm2.put("oko" , "eyes");
        hm2.put("nie" , "no");
        hm2.put("objektovo orientovanie programovanie" , "objected oriented programming");

        System.out.println(hm.equals(hm2));

        for (Map.Entry<String, String> y : hm.entrySet()) {
            boolean isFound = y.getKey().contains("y") ;
            boolean isFoundd = y.getValue().contains("y");
            if (isFoundd){
                if (y.getValue().charAt(0) == 'y'){
                    System.out.println(y.getValue());
                }



            }
        }

        String kluc = "";
        String hodnota = "";

        System.out.println("zadaj kluc: " );
        kluc = KeyboardInput.readString();
        System.out.println("zadaj hodnotu: " );
        hodnota = KeyboardInput.readString();
        int counter = 0;

        for (Map.Entry<String, String> me : hm.entrySet()) {
            if (kluc.equals(me.getKey())){
                counter++;
            }
        }
        if (counter == 1){
            System.out.println("nieje mozne");
        } else {
            hm.put(kluc , hodnota);
            System.out.println("slovo bolo pridane");
        }

        // Traversing through the map
        for (Map.Entry<String, String> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println("////////////////////////////");
        System.out.println("zadaj slovo: " );
        String slovo = "";
        slovo = KeyboardInput.readString();

        for (Map.Entry<String, String> me : hm.entrySet()) {
            if (slovo.equals(me.getKey())){
                System.out.println(me.getValue());
            }







        }



    }



}
