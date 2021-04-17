package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        if(Facade.esteMasaPregatita(new Masa(30,505)))
        {
            System.out.println("Va rog poftiti la masa.");
        }
        else
        {
            System.out.println("Mai asteptati putin.");
        }
    }
}
