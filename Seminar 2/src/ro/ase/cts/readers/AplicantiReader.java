package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantiReader {
    List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}
