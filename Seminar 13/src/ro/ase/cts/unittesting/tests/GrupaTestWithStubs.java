package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.unittesting.categories.TesteRight;
import ro.ase.cts.unittesting.categories.TesteUrgente;
import ro.ase.cts.unittesting.clase.Grupa;
import ro.ase.cts.unittesting.mocks.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithStubs {

    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void testGetPromovabilitateRight() {
        Grupa grupa = new Grupa(1086);
        for (int i = 0; i < 5; i++)
        {
            StudentStub studentStub = new StudentStub();
            grupa.adaugaStudent(studentStub);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.1);
    }
}