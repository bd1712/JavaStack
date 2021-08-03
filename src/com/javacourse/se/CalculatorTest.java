package com.javacourse.se;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator cal;

    @BeforeEach
    void setUp() throws Exception {
        cal = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, cal.add(2.0,  3.0));
        assertEquals(5.0, cal.add(2.0,  3.0), " Die Summe von 2.0 und 3.0 ist 5.0");
        assertEquals(-0.2, cal.add(2.0,  -2.2),0.001, " Die Summe von 2.0 und -2.2 ist -0.2");
        assertTrue(cal.add(2.0, 3.0)>=0.0, "Die Summe von 2 und 3 ist groesser als 0");


    }

    @Test
    void testDiv() {
        double ef[] = new double[5];
        double cf[] = {1.0, 0.5, 0.25, Double.POSITIVE_INFINITY, Double.NaN};
        double af[] = {1.0, 2.0, -1.0, 3.0, 0.0};
        double bf[] = {1.0, 4.0, -4.0, 0.0, 0.0};
        for(int i=0; i<5;i++)
            ef[i]=cal.div(af[i], bf[i]);
        assertArrayEquals(cf, ef);
    }

}
