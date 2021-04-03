package ro.ase.cts.factorymethod.clase;

public abstract class Jucator {
    private String nume;
    private int numarTricou;

    public Jucator(String nume, int numarTricou) {
        this.nume = nume;
        this.numarTricou = numarTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTricou=").append(numarTricou);
        sb.append('}');
        return sb.toString();
    }
}
