package ro.ase.cts.state.stari.clase;

public class Libera implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof Libera))
        {
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata.");
            masa.setStare(new Libera());
        }
        else
        {
            System.out.println("Masa nu poate fi eliberata.");
        }
    }
}
