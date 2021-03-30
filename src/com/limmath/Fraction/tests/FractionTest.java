package com.limmath.Fraction.tests;

import com.limmath.Fraction.Fraction;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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

    @org.junit.jupiter.api.Test
    void sum() {


        Fraction f3 = Fraction.Sum(f1,f2);
        assertEquals(3.5,f3.getDenominator());
        System.out.print(f3.toString());
    }
}