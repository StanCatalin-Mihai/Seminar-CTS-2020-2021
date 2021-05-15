package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerStadion;
import ro.ase.cts.memento.clase.Meci;

public class Main {
    public static void main(String[] args) {
        ManagerStadion manager = new ManagerStadion("Barbu");

        Meci meci1 = new Meci("Steaua","Dinamo",10000,9600,23452);
        manager.addMemento(meci1.creareMemento());

        meci1.setNrSpectatori(10000);
        meci1.setEchipaGazda("Barcelona");

        manager.addMemento(meci1.creareMemento());

        System.out.println(meci1.toString());

        System.out.println("================================");

        meci1.setMemento(manager.getMementoFromIndex(0));

        System.out.println(meci1.toString());

        System.out.println("================================");

        meci1.setMemento(manager.getLastMemento());

        System.out.println(meci1.toString());
    }
}
