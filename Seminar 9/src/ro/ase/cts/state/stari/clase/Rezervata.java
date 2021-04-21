package ro.ase.cts.state.stari.clase;

public class Rezervata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof Libera)
        {
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost rezervata.");
            masa.setStare(new Rezervata());
        }
        else
        {
            System.out.println("Masa nu poate fi rezervata.");
        }
    }
}
