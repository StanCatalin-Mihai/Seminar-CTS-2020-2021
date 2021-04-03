package ro.ase.cts.factorymethod.clase;

public class Fundas extends Jucator {
    public Fundas(String nume, int numarTricou) {
        super(nume, numarTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
