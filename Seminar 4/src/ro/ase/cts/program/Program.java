package ro.ase.cts.program;

import ro.ase.cts.clase.Masca;
import ro.ase.cts.clase.ParlamentEager;
import ro.ase.cts.clase.ParlamentLazy;

public class Program {

    public static void main(String[] args) {
        ParlamentEager parlament1 = ParlamentEager.getInstance();
        ParlamentEager parlament2 = ParlamentEager.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("==================================================");

        parlament1.setNrParlamentari(300);
        parlament2.setDenumireSediu("Za Palace");

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("==================================================");

        ParlamentLazy parlament3 = ParlamentLazy.getInstance("Hungary",1,100000000,"Za Country");
        ParlamentLazy parlament4 = ParlamentLazy.getInstance("Hungary",5,100000000,"Za Country");

        System.out.println(parlament3.toString());
        System.out.println(parlament4.toString());
        System.out.println("==================================================");

        parlament3.setNrParlamentari(2);
        parlament4.setDenumireSediu("Za Palais");

        System.out.println(parlament3.toString());
        System.out.println(parlament4.toString());
        System.out.println("==================================================");

        Masca masca1 = Masca.getInstance("Iron Man",10,5,false);
        Masca masca2 = Masca.getInstance("Iron Man",23,5,false);

        System.out.println(masca1.toString());
        System.out.println(masca2.toString());
        System.out.println("==================================================");

        masca1.setAreCurele(true);
        masca2.setPret(50.33);

        System.out.println(masca1.toString());
        System.out.println(masca2.toString());
        System.out.println("==================================================");
    }
}
