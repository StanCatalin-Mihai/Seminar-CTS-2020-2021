package ro.ase.cts.command.clase;

public class ComandaRetragere extends Comanda {

    public ComandaRetragere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().retragere(super.getSuma());
    }
}
