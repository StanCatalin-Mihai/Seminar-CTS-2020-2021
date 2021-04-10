package ro.ase.cts.adapter.clase.program;

import ro.ase.cts.adapter.clase.clase.AdapterLeasing;
import ro.ase.cts.adapter.clase.clase.Creditable;

public class Main {

    public static void printeazaInformatiiClient(Creditable creditat)
    {
        creditat.crediteaza();
    }

    public static void main(String[] args) {
        AdapterLeasing adapter = new AdapterLeasing("Ionel", (float)103232.43);
        printeazaInformatiiClient(adapter);
    }
}
