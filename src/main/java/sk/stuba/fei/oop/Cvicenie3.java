package sk.stuba.fei.oop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;


import sk.stuba.fei.oop.car.Student;

import java.util.Arrays;

public class Cvicenie3 {
    public static void main(String[] args) {
        System.out.println("ahoj miso");

        Student miso = new Student(5,"Michal","Matistik",20);
        Student matus = new Student(2,"Matus","Vidiecan",21);
        Student filip = new Student(3,"Filip","Juran",22);
        Student ivan = new Student(4,"Ivan","Micik",23);

        Student[] students = {miso,matus,filip,ivan};

        //System.out.println("pred triedenim --> " + Arrays.toString(students));


        Arrays.sort(students, new Student.IdComparator());

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }

        System.out.println("\nPodla mena: \n");

        Arrays.sort(students, new Student.NameComparator());

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }

        System.out.println("\nPodla ID: \n");

        Arrays.sort(students, new Student.IdComparator());

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }

        System.out.println("\nPodla Priezviska: \n");

        Arrays.sort(students, new Student.PriezviskoComparator());

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }

        System.out.println("\nPodla Veku: \n");

        Arrays.sort(students, new Student.VekComparator());

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " ");
        }




    }








    }

