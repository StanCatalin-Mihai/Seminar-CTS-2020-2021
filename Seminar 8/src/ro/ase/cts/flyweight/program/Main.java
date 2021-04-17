package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1,50);
        Rezervare rezervare2 = new Rezervare(2,35);
        Rezervare rezervare3 = new Rezervare(3,20);
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getClient("203000").printeazaRezervare(rezervare1);
        flyweightFactory.getClient("2033").printeazaRezervare(rezervare2);
        flyweightFactory.getClient("203000").printeazaRezervare(rezervare3);
    }
}
