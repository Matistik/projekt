package Cvicenie4_ulohy;

abstract public class Dedenie {

    int pocet_noh;
    abstract void zvuk();

    public int getPocet_noh() {
        return pocet_noh;
    }

    @Override
    public String toString() {
        return "Dedenie{" +
                "pocet_noh=" + pocet_noh +
                '}';
    }
}




