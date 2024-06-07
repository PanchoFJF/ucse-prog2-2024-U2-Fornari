package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AvionTest {

    private AvionComercial avion = new AvionComercial(300, 125);
    @Test
    void getCapacidadCombustibleTest() {
        int res = avion.getCapacidadCombustible();
        Assertions.assertEquals(res, 300);
    }

    @Test
    void getConsumoCombustibleTest() {
        int res = avion.getConsumoCombustible();
        Assertions.assertEquals(res, 125);
    }
}