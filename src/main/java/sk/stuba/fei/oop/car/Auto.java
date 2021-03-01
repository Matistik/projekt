package sk.stuba.fei.oop.car;

public class Auto {
    public int pocetKolies;
    public int pocetDvery;
    public double kapacitaNadrze;
    public String nazov;

    public int one; //verejne, mozem upravovat
    int two; //iba v tom isto package, malo sa pouziva
    protected int three;
    private int four; //nemam pristup
}
