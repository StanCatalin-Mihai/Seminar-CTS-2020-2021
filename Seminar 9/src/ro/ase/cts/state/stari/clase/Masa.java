package ro.ase.cts.state.stari.clase;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new Libera();
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void ocupaMasa() {
        Ocupata ocupata = new Ocupata();
        ocupata.modificaStare(this);
    }

    public void elibereazaMasa() {
        Libera libera = new Libera();
        libera.modificaStare(this);
    }

    public void rezervaMasa() {
        Rezervata rezervata = new Rezervata();
        rezervata.modificaStare(this);
    }
}
