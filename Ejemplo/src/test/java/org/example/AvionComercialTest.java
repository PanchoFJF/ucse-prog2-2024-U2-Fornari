package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionComercialTest {

    private AvionComercial avionC = new AvionComercial(250, 100);

    @Test
    void volarComercialTest() {
        int res = avionC.volar(2);
        Assertions.assertEquals(res, 200);
    }
}