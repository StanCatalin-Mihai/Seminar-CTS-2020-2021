package ro.ase.cts.chain.clase;

public abstract class Cont {
    private float sold;
    private Cont succesorCont;

    public Cont(float sold) {
        this.sold = sold;
        this.succesorCont = null;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getSuccesorCont() {
        return succesorCont;
    }

    public void setSuccesorCont(Cont succesorCont) {
        this.succesorCont = succesorCont;
    }

    public abstract void realizeazaPlata(float suma);
}
