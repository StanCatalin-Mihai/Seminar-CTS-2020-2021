package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaAbonati = new ArrayList<>();

    public void adaugaAbonat(Observer observer){
        this.listaAbonati.add(observer);
    }
    public void stergeAbonat(Observer observer)
    {
        this.listaAbonati.remove(observer);
    }
    public void trimiteNotificare(String mesaj)
    {
        for(Observer observer : listaAbonati)
        {
            observer.receptioneazaMesaj(mesaj);
        }
    }
}
