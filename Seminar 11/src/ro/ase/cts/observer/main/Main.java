package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Smarandescu");
        Observer clientAbonat1 = new ClientAbonat("Bulai");
        Observer clientAbonat2 = new ClientAbonat("Elai");
        Observer clientAbonat3 = new ClientAbonat("Malai");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);
        managerSala.adaugaAbonat(clientAbonat3);

        managerSala.anuntaMeci("Volei");

        managerSala.stergeAbonat(clientAbonat1);

        managerSala.anuntaMeci("Handbal");
    }
}
