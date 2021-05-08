package ro.ase.cts.command.clase;

public class ComandaDepunere extends Comanda {

    public ComandaDepunere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().depunere(super.getSuma());
    }
}
