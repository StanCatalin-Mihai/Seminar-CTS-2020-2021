package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        Executant executant = new Executant("Popescu");

        managerComenzi.adaugaComanda(new ComandaCreare(executant,200));
        managerComenzi.executaComanda();
        managerComenzi.adaugaComanda(new ComandaRetragere(executant,150));
        managerComenzi.adaugaComanda(new ComandaDepunere(executant,100));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.adaugaComanda(new ComandaRetragere(executant,300));
        managerComenzi.executaComanda();
    }
}
