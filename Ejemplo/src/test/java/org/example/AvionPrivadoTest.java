package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionPrivadoTest {

    private AvionPrivado avionP = new AvionPrivado(400, 50);

    @Test
    void volarPrivadoTest() {
        int res = avionP.volar(3);
        Assertions.assertEquals(res, 350);
    }
}