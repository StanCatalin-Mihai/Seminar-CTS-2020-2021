package ro.ase.cts.unittesting.mocks;

import ro.ase.cts.unittesting.clase.IStudent;

import java.util.List;

public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Cata";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 6;
    }

    @Override
    public int getNota(int index) {
        return 7;
    }

    @Override
    public boolean areRestante() {
        return true;
    }
}
