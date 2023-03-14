package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {
        @Test
        void TestDevuelveEnCadena1() {
            Main numCalc = new Main();
            String numACalc = numCalc.pedirNumero(1);
            assertEquals("1", numACalc);
        }

        @Test
        void TestDevuelveEnCadena2() {
            Main numCalc = new Main();
            String numACalc = numCalc.pedirNumero(2);
            assertEquals("2", numACalc);
        }

        @Test
        void ProbarNum3() {
            Main numCalc = new Main();
            String numACalc = numCalc.pedirNumero(3);
            assertEquals("Fizz", numACalc);
        }
    }
