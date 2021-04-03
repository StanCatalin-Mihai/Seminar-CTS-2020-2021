package ro.ase.cts.factorymethod.clase;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int numarTricou) {
        super(nume, numarTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
