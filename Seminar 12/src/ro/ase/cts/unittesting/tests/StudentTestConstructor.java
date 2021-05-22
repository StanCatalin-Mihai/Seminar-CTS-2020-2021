package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import ro.ase.cts.unittesting.clase.Student;

import static org.junit.Assert.*;

public class StudentTestConstructor {

    @Test
    public void testConstructorWorksCorrectlyForName()
    {
        String nume = "Gigel";
        Student student = new Student(nume);
//        if(nume.equals(student.getNume()))
//        {
//            System.out.println("E in regula");
//        }
//        else
//        {
//            System.out.println("Constructorul nu initializeaza numele corect");
//        }
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testConstructorsWorkCorrectlyMemoryAllocation()
    {
        Student student = new Student();
        assertNotNull("Lista nu a fost initializata - Constructor fara parametrii",student.getNote());
        assertNotNull("Numele nu a fost initializat - Constructor fara parametrii",student.getNume());
        Student student2 = new Student("Popescu");
        assertNotNull("Lista nu a fost initializata - Constructor cu parametrii",student2.getNote());
        assertNotNull("Numele nu a fost initializat - Constructor cu parametrii",student2.getNume());
    }

}