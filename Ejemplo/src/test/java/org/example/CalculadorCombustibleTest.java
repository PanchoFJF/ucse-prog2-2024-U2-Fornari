package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorCombustibleTest {
    AvionPrivado avionP = new AvionPrivado(700, 75);
    AvionComercial avionC = new AvionComercial(500, 100);

    @Test
    void calcularCombustibleAvionComercialTest() {
        int res = CalculadorCombustible.getInstance().calcularCombustible(avionC, 2);
        Assertions.assertEquals(res, 200);
    }

    @Test
    void calcularCombustibleAvionPrivadoTest() {
        int res = CalculadorCombustible.getInstance().calcularCombustible(avionP, 3);
        Assertions.assertEquals(res, 575);
    }
}