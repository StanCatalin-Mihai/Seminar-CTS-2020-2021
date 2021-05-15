package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {
    private String numeSala;

    public ManagerSala(String numeSala) {
        this.numeSala = numeSala;
    }

    public void anuntaMeci(String tipMeci)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sala ").append(this.numeSala).append(" va gazdui un meci de ").append(tipMeci);
        super.trimiteNotificare(stringBuilder.toString());
    }
}
