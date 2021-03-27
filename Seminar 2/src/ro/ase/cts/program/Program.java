package ro.ase.cts.program;

import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AplicantiReader;
import ro.ase.cts.readers.StudentiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantiReader reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti( new StudentiReader("Seminar 2/studenti.txt"));
			Proiect proiectTest = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti)
			{
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getFinantare());
				aplicant.afisareStatutInProiect(proiectTest);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
