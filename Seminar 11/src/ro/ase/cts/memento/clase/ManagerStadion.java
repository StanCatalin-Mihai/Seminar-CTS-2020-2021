package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerStadion {
    private List<MementoMeci> listaMementouri = new ArrayList<>();
    private String numeManager;

    public ManagerStadion(String numeManager) {
        this.numeManager = numeManager;
    }

    public void addMemento(MementoMeci mementoMeci)
    {
        this.listaMementouri.add(mementoMeci);
    }

    public MementoMeci getLastMemento()
    {
        if(this.listaMementouri.size() != 0)
        {
            return this.listaMementouri.get(this.listaMementouri.size() - 1);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }

    public MementoMeci getMementoFromIndex(int index)
    {
        if(index >= 0 && index < this.listaMementouri.size())
        {
            return this.listaMementouri.get(index);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
