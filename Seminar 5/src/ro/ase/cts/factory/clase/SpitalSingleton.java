package ro.ase.cts.factory.clase;

public class SpitalSingleton {
    private static SpitalSingleton spitalSingleton = null;

    public static synchronized SpitalSingleton getInstance(){
        if (SpitalSingleton.spitalSingleton == null){
            SpitalSingleton.spitalSingleton = new SpitalSingleton();
        }
        return SpitalSingleton.spitalSingleton;
    }

    private SpitalSingleton(){}

    public PersonalMedical create(TipPersonal tipPersonal, String nume, float salariu){
        switch (tipPersonal){
            case Medic: return new Medic(nume, salariu);
            case Asistent: return new Asistent(nume, salariu);
            case Brancardier: return new Brancardier(nume, salariu);
            default:throw new IllegalArgumentException("Tip invalid");
        }
    }
}