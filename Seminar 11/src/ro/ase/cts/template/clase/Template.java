package ro.ase.cts.template.clase;

public abstract class Template {

    public final void intraPeStadion()
    {
        seAsazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        seOcupaLoc();
    }

    public abstract void seAsazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void seOcupaLoc();
}
