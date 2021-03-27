package ro.ase.cts.factory.program;

import ro.ase.cts.factory.clase.*;

public class Main {

    public static void main(String[] args) {
        Spital spital = new Spital();
        PersonalMedical medic = spital.create(TipPersonal.Medic,"Bubu",(float)1000.4);
        PersonalMedical asistent = spital.create(TipPersonal.Asistent,"Blaebl",(float)1030.4);
        PersonalMedical brancardier = spital.create(TipPersonal.Brancardier,"Badeu",(float)1050.4);

        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(brancardier.toString());
    }
}
