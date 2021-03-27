package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaDenumiri = new ArrayList<>();
        listaDenumiri.add("H2O");
        listaDenumiri.add("CO2");
        List<Integer> listaCantitati = new ArrayList<>();
        listaCantitati.add(2);
        listaCantitati.add(600);
        Reteta reteta1 = new Reteta(listaDenumiri, listaCantitati);
        System.out.println(reteta1.toString());
        Reteta reteta2 = (Reteta)reteta1.copiaza();
        System.out.println(reteta2.toString());
    }
}
