package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataBonuriMasa;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionel",new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard());
        client.platesteNota((float) 100.3);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota((float)1000.50);
    }
}
