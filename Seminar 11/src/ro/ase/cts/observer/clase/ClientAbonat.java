package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("A fost receptionat mesajul : " + mesaj + ".");
    }
}
