package ro.ase.cts.command.clase;

public class Executant {
    private float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public void creazaCont(float sold) {
        this.sold = sold;
        System.out.println("S-a constituit contul cu suma de " + this.sold + " lei.");
    }

    public void retragere(float suma)
    {
        if(this.sold > suma)
        {
            this.sold = this.sold - suma;
            System.out.println("S-a retras suma de " + suma + " lei.");
        }
        else
        {
            System.out.println("Fonduri insuficiente");
        }
    }

    public void depunere(float suma)
    {
        this.sold = this.sold + suma;
        System.out.println("S-a depus in cont suma de " + suma + " lei.");
    }
}
