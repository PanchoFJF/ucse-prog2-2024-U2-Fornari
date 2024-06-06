package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AvionTest {

    Avion avion = mock(Avion.class); {
        avion.capacidadCombustible = 200;
        avion.consumoCombustible = 150;
    }

    @Test
    void getCapacidadCombustible() {

        when(avion.capacidadCombustible()).thenReturn(200);
    }

    @Test
    void getConsumoCombustible() {
    }
}