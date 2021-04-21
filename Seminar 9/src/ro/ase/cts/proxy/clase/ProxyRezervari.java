package ro.ase.cts.proxy.clase;

public class ProxyRezervari implements OperatorRezervare {
    private ManagerRezervari manager;
    private int pragPersoane;

    public ProxyRezervari(ManagerRezervari manager, int pragPersoane) {
        this.manager = manager;
        this.pragPersoane = pragPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane >= this.pragPersoane)
        {
            this.manager.rezerva(nrPersoane);
        }
        else
        {
            System.out.println("Rezervarea nu se poate realiza. Va rugam sa va prezentati la restaurant deoarece sunt suficiente locuri pentru mese de 2 persoane.");
        }
    }
}
