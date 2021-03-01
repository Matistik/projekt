package sk.stuba.fei.oop.car;

public class Auto {

    private static final double FUEL_PER_KM= 0.5; //pri konstatne davam static, ked je final neda sa menit

    public double kapacitaNadrze;
    public double stavNadrze;

    public void drive(double distanceInKm){
       // this.stavNadrze -= distanceInKm * Auto.FUEL_PER_KM;
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if(stavNadrze < 0){
            stavNadrze = 0;
        }

    }
}
