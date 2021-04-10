package ro.ase.cts.adapter.clase.clase;

public class FrameworkLeasing {
    private String numeClient;
    private float sumaAcordata;

    public FrameworkLeasing(String numeClient, float sumaAcordata) {
        this.numeClient = numeClient;
        this.sumaAcordata = sumaAcordata;
    }

    public void imprumuta()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Clientului ").append(this.numeClient).append(" i-a fost oferita suma in valoare de ")
                .append(this.sumaAcordata).append(" lei.");
        System.out.println(builder.toString());
    }
}
