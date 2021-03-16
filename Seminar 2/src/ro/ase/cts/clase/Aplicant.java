package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void afisareStatutInProiect(Proiect proiect){
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicantul ").append(nume).append(" ").append(prenume).append(" ");
		builder.append(punctaj > proiect.getPragAcceptare() ? "a fost acceptat." : "nu a fost acceptat.");
		System.out.println(builder.toString());
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiect;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setDenumiriProiecte(int nrProiecte, String[] denumiriProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public abstract float getFinantare();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Nume = ").append(this.nume).append(", Prenume = ").append(this.prenume).append(", Varsta = ")
				.append(this.varsta).append(", Punctaj = ").append(this.punctaj).append(", Numar proiecte = ")
				.append(this.nrProiecte).append(", Denumiri proiecte = ").append(Arrays.toString(this.denumiriProiecte));
		return builder.toString();
	}
}