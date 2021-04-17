package ro.ase.cts.facade.clase;

public class Masa {
    private int nrMasa;
    private int locuriMasa;

    public Masa(int nrMasa, int locuriMasa) {
        this.nrMasa = nrMasa;
        this.locuriMasa = locuriMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getLocuriMasa() {
        return locuriMasa;
    }

    public void setLocuriMasa(int locuriMasa) {
        this.locuriMasa = locuriMasa;
    }
}
