package ro.ase.cts.unittesting.tests;

import org.junit.Test;
import ro.ase.cts.unittesting.clase.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void adaugaNota() {
        Student student = new Student();
        int integer = 4;
        student.adaugaNota(integer);
        assertEquals(integer,student.getNota(0));
    }
}