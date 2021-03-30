package com.limmath.UnitTests;

import com.limmath.Fraction.Fraction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {


    Fraction f1 = new Fraction(1,3.5);
    Fraction f2 = new Fraction(3,0.5);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum() {

        Fraction f3 = Fraction.Sum(f1,f2);
        assertEquals(3.5,f3.getDenominator());
        System.out.print(f3.toString());
    }
}