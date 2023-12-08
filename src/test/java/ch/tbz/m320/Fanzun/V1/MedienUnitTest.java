package ch.tbz.m320.Fanzun.V1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MedienUnitTest {

    private ArrayList<Medien> medienListe;

    @BeforeEach
    public void setUp() {
        medienListe = new ArrayList<>();
    }

    @Test
    public void testMedienVerwaltung() {
        medienListe.add(new DVD("Inception", 2010, 19.99, 148));
        medienListe.add(new CD("Abbey Road", 1969, 14.99, "The Beatles"));
        medienListe.add(new Buch("To Kill a Mockingbird", 1960, 9.99, "9780061120084"));

        assertEquals(3, medienListe.size());
    }

    @Test
    public void testMedienEntfernen() {
        medienListe.add(new DVD("Inception", 2010, 19.99, 148));
        medienListe.add(new CD("Abbey Road", 1969, 14.99, "The Beatles"));
        medienListe.add(new Buch("To Kill a Mockingbird", 1960, 9.99, "9780061120084"));

        medienListe.remove(1);

        assertEquals(2, medienListe.size());
    }
}
