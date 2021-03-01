package sk.stuba.fei.oop.car;

public class Auto {

    private static final double FUEL_PER_KM= 0.2; //pri konstatne davam static, ked je final neda sa menit

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;

    public Auto(double kapacitaNadrze){
        neojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public Auto(){
        kapacitaNadrze = 100;
    }


    public void drive(double distanceInKm){
       // this.stavNadrze -= distanceInKm * Auto.FUEL_PER_KM;
        this.neojazdene = false;
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if(stavNadrze < 0){
            stavNadrze = 0;
        }

    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public double dotankovat(){
        double diff = kapacitaNadrze - stavNadrze;
        stavNadrze = kapacitaNadrze;
        return diff;
    }

    public boolean isNeojazdene() {
        return neojazdene;
    }

    public void setNeojazdene(boolean neojazdene) {
        this.neojazdene = neojazdene;
    }

    public String currentState(){
            String result;
            if(this.neojazdene){
                result = "Auto je neojazdene.";
            } else {
                result = "Auto je ojazdene.";
            }
            result += "\n"+stavNadrze+"\\"+kapacitaNadrze;
            return result;
    }
}
