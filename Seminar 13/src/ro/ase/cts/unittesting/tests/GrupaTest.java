package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.unittesting.categories.TesteRight;
import ro.ase.cts.unittesting.categories.TesteUrgente;
import ro.ase.cts.unittesting.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(TesteRight.class)
    public void testConstructorRight()
    {
        Grupa grupa = new Grupa(1086);
        assertEquals(1086,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorBoundaryInferior()
    {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorBoundarySuperior()
    {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConstructorErrorInferior()
    {
        Grupa grupa = new Grupa(999);


    }

    @Test (expected = IllegalArgumentException.class)
    public void testConstructorErrorSuperior()
    {
        Grupa grupa = new Grupa(1101);
    }

    @Test (timeout = 500)
    public void testConstructorPerformance()
    {
        Grupa grupa = new Grupa(1084);
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorRange()
    {
        Grupa grupa = new Grupa(1001);
        assertEquals(1001,grupa.getNrGrupa());
        Grupa grupa2 = new Grupa(1099);
        assertEquals(1099,grupa2.getNrGrupa());
    }

    @Test
    public void testConstructorExistence()
    {
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());

    }

}