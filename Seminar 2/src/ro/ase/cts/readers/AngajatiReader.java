package ro.ase.cts.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader {

    public AngajatiReader(String filename) {
        super(filename);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.filename));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();
        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input, angajat);
            int salariu = input.nextInt();
            String ocupatie = input.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input.close();
        return angajati;
    }
}
