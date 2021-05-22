package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import ro.ase.cts.unittesting.clase.Student;

import static org.junit.Assert.*;

public class StudentTestSetNume {

    @Test
    public void testSetNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);
        assertEquals(nume,student.getNume());
    }
}