package ro.ase.cts.memento.clase;

public class Meci {
    private String echipaGazda;
    private String echipaOaspete;
    private int nrBilete;
    private int nrSpectatori;
    private int nrSticleApaVandute;

    public Meci(String echipaGazda, String echipaOaspete, int nrBilete, int nrSpectatori, int nrSticleApaVandute) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrBilete = nrBilete;
        this.nrSpectatori = nrSpectatori;
        this.nrSticleApaVandute = nrSticleApaVandute;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setNrBilete(int nrBilete) {
        this.nrBilete = nrBilete;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrSticleApaVandute(int nrSticleApaVandute) {
        this.nrSticleApaVandute = nrSticleApaVandute;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", nrBilete=").append(nrBilete);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrSticleApaVandute=").append(nrSticleApaVandute);
        sb.append('}');
        return sb.toString();
    }

    public MementoMeci creareMemento() {
        return new MementoMeci(this.echipaGazda, this.echipaOaspete, this.nrSpectatori);
    }

    public void setMemento(MementoMeci mementoMeci)
    {
        this.echipaGazda = mementoMeci.getEchipaGazda();
        this.echipaOaspete = mementoMeci.getEchipaOaspete();
        this.nrSpectatori = mementoMeci.getNrSpectatori();
    }
}
