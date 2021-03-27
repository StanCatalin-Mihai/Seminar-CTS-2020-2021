package ro.ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;
	
	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elev: ").append(super.toString()).append(", Clasa = ").append(this.clasa)
				.append(", Tutore = ").append(this.tutore).append(".");
		return builder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumiriProiecte, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public float getFinantare(){
		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}
}
