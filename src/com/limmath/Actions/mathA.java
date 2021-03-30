package com.limmath.Actions;

public class mathA {


    //// НОД ///////
    public static double gcd(double a,double b){

        return b == 0 ? a : gcd(b,a % b);
    }

    //// НОК ////////////////
    public static double lcm(double a,double b){
        return (a*b) / gcd(a,b);
    }
}
