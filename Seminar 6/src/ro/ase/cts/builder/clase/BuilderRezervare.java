package ro.ase.cts.builder.clase;

public class BuilderRezervare implements AbstractBuilder{
    Rezervare rezervare;

    public BuilderRezervare() {
        this.rezervare = new Rezervare(0,false,false,
                false,false,"");
    }

    public BuilderRezervare(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare,false,false,
                false,false,"");
    }

    public BuilderRezervare setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
