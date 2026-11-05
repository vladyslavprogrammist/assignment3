package com.shpp.p2p.cs.vyevtushenko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part3 extends TextProgram {
    public void run() {
        double base = readDouble("Enter Base : ");
        int exponent = readInt("Enter Exponent : ");
        println("Your result is " + raiseToPower(base, exponent));
    }

    private double raiseToPower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            double res = 1;
            while(exponent != 0) {
                res *= base ;
                exponent--;
            }
            return res;
        } else {
            double res = 1;
            while(exponent != 0) {
                res *= base ;
                exponent++;
            }
            return 1.0 / res;
        }
    }
}
