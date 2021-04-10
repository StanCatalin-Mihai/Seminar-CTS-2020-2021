package ro.ase.cts.adapter.obiecte.clase;

public class AdapterLeasing implements Creditable{
    private FrameworkLeasing referintaLeasing;

    public AdapterLeasing(FrameworkLeasing referintaLeasing) {
        this.referintaLeasing = referintaLeasing;
    }

    @Override
    public void crediteaza() {
        this.referintaLeasing.imprumuta();
    }
}
