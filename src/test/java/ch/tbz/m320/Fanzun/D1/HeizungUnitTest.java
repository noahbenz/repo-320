package ch.tbz.m320.Fanzun.D1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HeizungUnitTest {
    private Heizung heizung;

    @Before
    public void setUp() {
        heizung = new Heizung(20, 2);
    }

    @Test
    public void testIncreaseTemperature() {
        heizung.increaseTemperature();
        assertEquals(22, heizung.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        heizung.decreaseTemperature();
        assertEquals(18, heizung.getTemperature());
    }
}
