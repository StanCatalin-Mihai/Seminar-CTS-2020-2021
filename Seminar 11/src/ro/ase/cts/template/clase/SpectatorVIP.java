package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template {
    private String numeSpectator;
    private int numarLoja;

    public SpectatorVIP(String numeSpectator, int numarLoja) {
        this.numeSpectator = numeSpectator;
        this.numarLoja = numarLoja;
    }

    @Override
    public void seAsazaLaCoada() {
        System.out.println(this.numeSpectator + " va intra pe la intrarea VIP.");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.numeSpectator + " prezinta biletul pentru loja " + this.numarLoja + ".");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println("Se controleaza corporal spectatorul : " + this.numeSpectator + ".");
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.numeSpectator + " si-a ocupat locul la loja cu numarul " + this.numarLoja + ".");
    }
}
