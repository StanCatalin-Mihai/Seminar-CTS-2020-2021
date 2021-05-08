package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<Comanda> listaComenzi = new ArrayList<>();

    public void adaugaComanda(Comanda comanda) {
        this.listaComenzi.add(comanda);
    }

    public void executaComanda() {
        if (this.listaComenzi.size() != 0) {
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else
        {
            System.out.println("Nu exista comenzi de executat");
        }
    }
}
