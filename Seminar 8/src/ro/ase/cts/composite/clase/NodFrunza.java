package ro.ase.cts.composite.clase;

public class NodFrunza extends ComponentaAbstracta {
    public NodFrunza(String nume) {
        super(nume);
    }

    @Override
    public void printeazaElement() {
        System.out.println("Numele produsului este: " + this.nume);
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        throw new UnsupportedOperationException();
    }
}
