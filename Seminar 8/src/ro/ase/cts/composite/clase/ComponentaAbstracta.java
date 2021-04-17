package ro.ase.cts.composite.clase;

public abstract class ComponentaAbstracta {
    protected String nume;
    public abstract void printeazaElement();
    public abstract void adaugaNod(ComponentaAbstracta componentaAbstracta);
    public abstract void stergeNod(ComponentaAbstracta componentaAbstracta);
    public abstract ComponentaAbstracta getNod(int pozitie);

    public ComponentaAbstracta(String nume) {
        this.nume = nume;
    }
}
