package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import ro.ase.cts.unittesting.clase.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testAdaugaNota() {
        Student student = new Student();
        int integer = 4;
        student.adaugaNota(integer);
        assertEquals(integer,student.getNota(0));
    }

    @Test
    public void testGetNota() {
        Student student = new Student();
        student.adaugaNota(3);
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(1);
        assertEquals(1,student.getNota(3));
        assertEquals(5,student.getNota(1));

        assertEquals(new IndexOutOfBoundsException(),student.getNota(-1));
    }

    @Test
    public void testAdaugaNotaSingulara() {
        Student student = new Student();
        assertEquals(0,student.getNote().size());
        student.adaugaNota(3);
        assertEquals(1,student.getNote().size());
        student.adaugaNota(3);
        student.adaugaNota(3);
        student.adaugaNota(3);
        student.adaugaNota(3);
        student.adaugaNota(3);
        student.adaugaNota(3);
        assertEquals(7,student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorecta() {
        Student student = new Student();
        try{
            student.adaugaNota(-1);
            fail("S-a adaugat nota incorecta, metoda nu arunca exceptie");
        }
        catch (IllegalArgumentException ex)
        {
            assertTrue(true);
        }
        catch (Exception e)
        {
            fail("S-a aruncat alta exceptie");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJUnit4() {
        Student student = new Student();
        student.adaugaNota(-1);

    }

    @Test
    public void testAreRestante() {
        Student student = new Student();
        student.adaugaNota(3);
        assertTrue(student.areRestante());

    }

    @Test
    public void testNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(7);
        student.adaugaNota(10);
        assertFalse(student.areRestante());

    }

    @Test
    public void testCalculeazaMedieCorecta()
    {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        //assertEquals(9.5,student.calculeazaMedie()); deprecated
        assertEquals(9.5,student.calculeazaMedie(),0.0001);
    }
}