package ro.ase.cts.adapter.clase.clase;

public class AdapterLeasing extends FrameworkLeasing implements Creditable{

    public AdapterLeasing(String numeClient, float sumaAcordata){
        super(numeClient,sumaAcordata);
    }

    @Override
    public void crediteaza() {
        super.imprumuta();
    }
}
