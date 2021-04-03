package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1,true,false,true,false,"Rock");
        System.out.println(rezervare.toString());
        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setCodRezervare(3)
                .setAreBauturaRacoritoareInclusa(false)
                .setAreMancareInclusa(true);
        Rezervare rezervare2 = builderRezervare.build();
        System.out.println(rezervare2.toString());
        Rezervare rezervare3 = new BuilderRezervare()
                .setCodRezervare(10)
                .setAreBauturaRacoritoareInclusa(true)
                .setAreMancareInclusa(true).build();
        System.out.println(rezervare3.toString());

        Rezervare rezervare4 = builderRezervare.setCodRezervare(6).build();
        System.out.println(rezervare4.toString());
        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2().setAreMancareInclusa(true).setAreScaunErgonomic(true).setAreBauturaRacoritoareInclusa(true);
        Rezervare rezervare5 = builderRezervareV2.setCodRezervare(15).build();
        Rezervare rezervare6 = builderRezervareV2.setCodRezervare(17).build();

        System.out.println(rezervare5.toString());
        System.out.println(rezervare6.toString());
    }
}
