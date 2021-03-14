package Cvicenie4_ulohy;

public class Pes extends Dedenie {


    @Override
    void zvuk() {

    }

    public Pes() {
        pocet_noh = 4;
    }


    public Pes(String zvuk, int nohy) {
        super.pocet_noh = nohy;
    }

    @Override
    public String toString() {
        return "Pes{" +
                "pocet_noh=" + pocet_noh +
                '}';
    }
}




