package ro.ase.cts.memento.clase;

public class MementoMeci {
    private String echipaGazda;
    private String echipaOaspete;
    private int nrSpectatori;

    public MementoMeci(String echipaGazda, String echipaOaspete, int nrSpectatori) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }
}
