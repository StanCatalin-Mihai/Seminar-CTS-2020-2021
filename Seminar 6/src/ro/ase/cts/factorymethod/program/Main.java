package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.*;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucator fabrica, String nume, int numarTricou) {
        Jucator jucator = fabrica.creeazaJucator(nume,numarTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(), "Boy1", 32);
        afiseazaInformatiiJucator(new FabricaFundas(), "Boy2", 54);
        afiseazaInformatiiJucator(new FabricaMijlocas(), "Boy3", 10);
    }
}
