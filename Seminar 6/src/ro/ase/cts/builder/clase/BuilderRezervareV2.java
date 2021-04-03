package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzica;

    @Override
    public Rezervare build() {
        return new Rezervare(this.codRezervare,this.areMancareInclusa,this.areScaunErgonomic,this.areBauturaRacoritoareInclusa,this.areMuzicaAmbientalaPersonalizata,this.genMuzica);
    }

    public BuilderRezervareV2() {
        codRezervare = 0;
        genMuzica = "Rock";
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderRezervareV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
