package ro.ase.cts.factorymethod.clase;

public class Portar extends Jucator {
    public Portar(String nume, int numarTricou) {
        super(nume, numarTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
