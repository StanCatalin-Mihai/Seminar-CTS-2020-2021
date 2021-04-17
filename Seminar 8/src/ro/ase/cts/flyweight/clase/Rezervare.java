package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int nrRezervare;
    private int nrLocuri;

    public Rezervare(int nrRezervare, int nrLocuri) {
        this.nrRezervare = nrRezervare;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
