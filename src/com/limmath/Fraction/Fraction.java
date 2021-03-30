package com.limmath.Fraction;

import com.limmath.Actions.mathA;

public class Fraction {

    private double numerator,denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public static Fraction Sum(Fraction f1, Fraction f2)
    {
        if (f1.denominator == f2.denominator)
        {
            return new Fraction(f1.numerator+f2.numerator,f1.denominator);
        }

        else {

            double newDenominator = mathA.lcm(f1.denominator,f2.denominator);
            double newNumerator1 = f1.numerator * (newDenominator/f1.denominator);
            double newNumerator2 = f2.numerator * (newDenominator/f2.denominator);

            return  new Fraction(newNumerator1+newNumerator2,newDenominator);

        }

    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }
}
