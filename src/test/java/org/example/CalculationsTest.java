package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationsTest {

    @Test
   public void multiply() {
        assertEquals(6, Calculations.multiply(2, 3));
    }
}
