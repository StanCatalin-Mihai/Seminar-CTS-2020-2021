package ro.ase.cts.facade.clase;

class Picolo {
    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean esteMasaDebarasata(Masa masa) {
        return masa.getNrMasa() % 3 == 0;
    }

    public boolean esteMasaAranjata(Masa masa) {
        return masa.getNrMasa() % 5 == 0;
    }
}
