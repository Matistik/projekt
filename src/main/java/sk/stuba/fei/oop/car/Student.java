package sk.stuba.fei.oop.car;
import sk.stuba.fei.oop.Cvicenie3;

import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    public int id;
    public String meno;
    public String priezvisko;
    public int vek;


    public Student(int id, String meno, String priezvisko, int vek) {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }


    @Override
    public String toString() {
        return
                "Student{" +
                "id=" + id +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }


    @Override
    public int compareTo(Student o) {


        return this.id - o.id;
    }

    class MenoComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getMeno().compareTo(s2.getMeno());
        }


    }

    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student emp1, Student emp2) {
            return emp1.getMeno().compareTo(emp2.getMeno());
        }
    }

    public static class PriezviskoComparator implements Comparator<Student> {

        @Override
        public int compare(Student emp1, Student emp2) {
            return emp1.getPriezvisko().compareTo(emp2.getPriezvisko());
        }
    }

    public static class IdComparator implements Comparator<Student> {

        @Override
        public int compare(Student emp1, Student emp2) {
            return emp1.getId() - emp2.getId();
        }
    }

    public static class VekComparator implements Comparator<Student> {

        @Override
        public int compare(Student emp1, Student emp2) {
            return emp1.getVek() - emp2.getVek();
        }
    }



}


