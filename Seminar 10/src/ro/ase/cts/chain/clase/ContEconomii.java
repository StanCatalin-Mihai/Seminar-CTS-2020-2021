package ro.ase.cts.chain.clase;

public class ContEconomii extends Cont {

    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma)
        {
            System.out.println("Se realizeaza plata din contul de economii in valoare de " + suma);
            super.setSold(super.getSold()-suma);
            System.out.println("Sold cont economii " + super.getSold());
        }
        else if(super.getSuccesorCont() != null)
        {
            super.getSuccesorCont().realizeazaPlata(suma);
        }
        else
        {
            System.out.println("Nu se poate realiza plata");
        }
    }
}
