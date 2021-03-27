package ro.ase.cts.factory.clase;

public class Spital {

    public Spital() {
    }

    public PersonalMedical create(TipPersonal tip, String nume, float salariu)
    {   PersonalMedical personal = null;
        switch(tip)
        {
            case Medic:{
                personal = new Medic(nume,salariu);
                break;
            }
            case Asistent:
            {
                personal = new Asistent(nume,salariu);
                break;
            }
            case Brancardier:
            {
                personal = new Brancardier(nume,salariu);
                break;
            }
            default: {
                throw new IllegalArgumentException("Tipul nu este corect!");
            }
        }
        return personal;
    }
}
