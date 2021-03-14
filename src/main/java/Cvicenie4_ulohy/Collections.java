package Cvicenie4_ulohy;
import sk.stuba.fei.oop.KeyboardInput;
import sk.stuba.fei.oop.car.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections extends Pes {


    public static void main(String[] args) {

        List<List> list = new ArrayList<List>();

        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> cisla = new ArrayList<Integer>();
        ArrayList<Pes> objekty = new ArrayList<Pes>();


        strings.add("strink");
        cisla.add(9);

        int zvuk = 0;

        System.out.println();
        zvuk = KeyboardInput.readInt();

        Pes pes = new Pes("haf", zvuk);


        objekty.add(pes);

        list.add(strings);
        list.add(cisla);
        list.add(objekty);

        for (List prvok : list) {
            System.out.println(prvok);
            if (prvok == objekty) {
                System.out.println(pes.getPocet_noh());
            }
        }

        List<List<Integer>> L;
        var m = 5;
        var n = 5;
        L = new ArrayList<>(m); // assuming m is the number or rows
        for (int i = 0; i < m; ++i) {
            L.add(new ArrayList<>(n));
        }





    }
}
