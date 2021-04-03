package ro.ase.cts.factorymethod.clase;

public class FabricaAtacant implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int numarTricou) {
        return new Atacant(nume, numarTricou);
    }
}
