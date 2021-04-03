package ro.ase.cts.factorymethod.clase;

public class Atacant extends Jucator {
    public Atacant(String nume, int numarTricou) {
        super(nume, numarTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
