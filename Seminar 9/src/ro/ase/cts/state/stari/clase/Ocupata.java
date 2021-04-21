package ro.ase.cts.state.stari.clase;

public class Ocupata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof Ocupata))
        {
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost ocupata.");
            masa.setStare(new Ocupata());
        }
        else
        {
            System.out.println("Masa nu poate fi ocupata.");
        }
    }
}
