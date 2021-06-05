package ro.ase.cts.unittesting.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.cts.unittesting.clase.Grupa;
import ro.ase.cts.unittesting.mocks.StudentDummy;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {
    static Grupa grupa;

    @Test
    public void testAddStudentReference()
    {
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
        assertEquals(1,grupa.getStudenti().size());
    }

    @Test
    public void testAddStudentBoundarySuperior()
    {
        assertEquals(35,grupa.getStudenti().size());
    }

    @BeforeClass
    public static void setupGrupa()
    {
       grupa = new Grupa(1086);
        for(int i = 0; i < 35; i++)
        {
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddStudentExceptie()
    {
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
    }

}