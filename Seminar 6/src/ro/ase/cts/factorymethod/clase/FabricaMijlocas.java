package ro.ase.cts.factorymethod.clase;

public class FabricaMijlocas implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int numarTricou) {
        return new Mijlocas(nume, numarTricou);
    }
}
