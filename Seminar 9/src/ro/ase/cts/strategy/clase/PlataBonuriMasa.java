package ro.ase.cts.strategy.clase;

public class PlataBonuriMasa implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata o plata cu bonuri de masa in valoare de " + suma + " lei.");
    }
}
