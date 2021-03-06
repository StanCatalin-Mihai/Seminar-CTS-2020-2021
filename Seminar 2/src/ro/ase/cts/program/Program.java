package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AplicantiReader;
import ro.ase.cts.readers.StudentiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(String numeFisier, AplicantiReader reader) throws FileNotFoundException {
		return reader.readAplicanti(numeFisier);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti("Seminar 2/studenti.txt", new StudentiReader());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
