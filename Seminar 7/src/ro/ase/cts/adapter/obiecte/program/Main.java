package ro.ase.cts.adapter.obiecte.program;

import ro.ase.cts.adapter.obiecte.clase.AdapterLeasing;
import ro.ase.cts.adapter.obiecte.clase.Creditable;
import ro.ase.cts.adapter.obiecte.clase.FrameworkLeasing;

public class Main {

    public static void printeazaInformatiiClient(Creditable creditat)
    {
        creditat.crediteaza();
    }

    public static void main(String[] args) {
        FrameworkLeasing leasing = new FrameworkLeasing("Ionel Baciu", (float)300.42);
        //printeazaInformatiiClient(leasing);
        AdapterLeasing adapter = new AdapterLeasing(leasing);
        printeazaInformatiiClient(adapter);
    }
}
