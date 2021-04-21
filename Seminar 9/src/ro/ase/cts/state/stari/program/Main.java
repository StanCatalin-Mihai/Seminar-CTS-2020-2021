package ro.ase.cts.state.stari.program;

import ro.ase.cts.state.stari.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(3);
        masa1.elibereazaMasa();
        masa1.rezervaMasa();
        //masa1.setStare(new Libera());
        masa1.ocupaMasa();
        masa1.rezervaMasa();
        masa1.elibereazaMasa();

    }
}
