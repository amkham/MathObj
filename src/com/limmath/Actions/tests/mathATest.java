package com.limmath.Actions.tests;

import com.limmath.Actions.mathA;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathATest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void gcd() {

        assertEquals(0.5, mathA.gcd(3.5,0.5));
    }

    @Test
    void lcm() {

        assertEquals(3.5,mathA.lcm(3.5,0.5));
    }
}