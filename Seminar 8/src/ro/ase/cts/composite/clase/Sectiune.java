package ro.ase.cts.composite.clase;

import java.util.ArrayList;

public class Sectiune extends ComponentaAbstracta {
    private ArrayList<ComponentaAbstracta> listaComponente = new ArrayList<>();

    public Sectiune(String nume) {
        super(nume);
    }

    public Sectiune(String nume, ArrayList<ComponentaAbstracta> listaComponente) {
        super(nume);
        this.listaComponente = listaComponente;
    }

    @Override
    public void printeazaElement() {
        System.out.println("Sectiune : " + this.nume);
        listaComponente.forEach(componenta ->
        {
            componenta.printeazaElement();
        });
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null)
        {
            listaComponente.add(componentaAbstracta);
        }
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null)
        {
            listaComponente.remove(componentaAbstracta);
        }
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie >= 0 && pozitie < listaComponente.size())
        {
            return listaComponente.get(pozitie);
        }
        throw new IndexOutOfBoundsException();
    }
}
