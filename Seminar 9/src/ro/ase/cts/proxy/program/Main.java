package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.ManagerRezervari;
import ro.ase.cts.proxy.clase.ProxyRezervari;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari manager = new ManagerRezervari("Isoletta");
        manager.rezerva(2);
        ProxyRezervari proxyManager = new ProxyRezervari(manager,4);
        proxyManager.rezerva(3);
        proxyManager.rezerva(5);
    }
}
