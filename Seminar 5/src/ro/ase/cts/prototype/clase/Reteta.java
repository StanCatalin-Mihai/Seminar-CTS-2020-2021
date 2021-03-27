package ro.ase.cts.prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype {
    private List<String> denumiriSolutii;
    private List<Integer> cantitati;

    private Reteta() {
    }

    public Reteta(List<String> denumiriSolutii, List<Integer> cantitati) {
        //Realizam validari pentru cantitatile solutiilor noastre.
        this.denumiriSolutii = denumiriSolutii;
        this.cantitati = cantitati;
    }

    public List<String> getDenumiriSolutii() {
        return denumiriSolutii;
    }

    public void setDenumiriSolutii(List<String> denumiriSolutii) {
        this.denumiriSolutii = denumiriSolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta();
        copie.cantitati = new ArrayList<>();
        copie.cantitati.addAll(this.cantitati);
        copie.denumiriSolutii = new ArrayList<>();
        copie.denumiriSolutii.addAll(this.denumiriSolutii);
        return copie;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Reteta{");
//        sb.append("denumiriSolutii=").append(denumiriSolutii);
//        sb.append(", cantitati=").append(cantitati);
//        sb.append('}');
//        return sb.toString();
//    }
}
