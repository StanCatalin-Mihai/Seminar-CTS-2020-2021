package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVIP;
import ro.ase.cts.template.clase.Template;

public class Main {
    public static void main(String[] args) {
        Template spectator = new SpectatorNormal("Xulescu");
        Template spectatorVIP = new SpectatorVIP("Zulescu",2);

        spectator.intraPeStadion();
        System.out.println("-------------------------------------");
        spectatorVIP.intraPeStadion();
    }
}
