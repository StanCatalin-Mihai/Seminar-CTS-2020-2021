package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Angajat: ").append(super.toString()).append(", Facultate = ").append(this.facultate)
				.append(", An studii = ").append(this.anStudii).append(".");
		return builder.toString();
	}

	@Override
	public float getFinantare(){
		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}
}
