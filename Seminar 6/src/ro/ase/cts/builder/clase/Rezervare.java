package ro.ase.cts.builder.clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritoareInclusa=").append(areBauturaRacoritoareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
