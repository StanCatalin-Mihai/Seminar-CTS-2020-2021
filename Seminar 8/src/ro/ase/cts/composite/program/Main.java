package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.NodFrunza;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune desert = new Sectiune("Deserturi");
        Sectiune bauturi = new Sectiune("Bauturi");
        NodFrunza cola = new NodFrunza("Cola");
        NodFrunza tiramisu = new NodFrunza("Tiramisu");
        NodFrunza frappe = new NodFrunza("Frappe");

        desert.adaugaNod(tiramisu);
        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(desert);
        meniu.adaugaNod(bauturi);
        meniu.printeazaElement();

        System.out.println("============================================");

        desert.adaugaNod(frappe);
        bauturi.stergeNod(frappe);

        meniu.printeazaElement();
    }
}
