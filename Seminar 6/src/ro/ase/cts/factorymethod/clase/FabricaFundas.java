package ro.ase.cts.factorymethod.clase;

public class FabricaFundas implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int numarTricou) {
        return new Fundas(nume, numarTricou);
    }
}
