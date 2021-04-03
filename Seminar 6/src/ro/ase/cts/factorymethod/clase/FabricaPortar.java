package ro.ase.cts.factorymethod.clase;

public class FabricaPortar implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int numarTricou) {
        return new Portar(nume, numarTricou);
    }
}
