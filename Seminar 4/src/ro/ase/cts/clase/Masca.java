package ro.ase.cts.clase;

public class Masca {
    private String nume;
    private double pret;
    private double latime;
    private boolean areCurele;

    private static Masca instanta = null;

    public static synchronized Masca getInstance(String nume, double pret, double latime, boolean areCurele) {
        if(instanta == null)
        {
            instanta = new Masca(nume, pret, latime, areCurele);
        }
        return instanta;
    }

    private Masca() {
        this.nume = "Darth Vader";
        this.pret = 100.34;
        this.latime = 5.4;
        this.areCurele = true;
    }

    private Masca(String nume, double pret, double latime, boolean areCurele) {
        this.nume = nume;
        this.pret = pret;
        this.latime = latime;
        this.areCurele = areCurele;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setAreCurele(boolean areCurele) {
        this.areCurele = areCurele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", latime=").append(latime);
        sb.append(", areCurele=").append(areCurele);
        sb.append('}');
        return sb.toString();
    }
}
