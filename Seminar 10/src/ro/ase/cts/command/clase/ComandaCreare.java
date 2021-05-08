package ro.ase.cts.command.clase;

public class ComandaCreare extends Comanda {

    public ComandaCreare(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creazaCont(super.getSuma());
    }
}
