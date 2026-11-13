package com.shpp.p2p.cs.vyevtushenko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Problem3 extends TextProgram {
    private static final double PROCENT = 0.075;
    public void run() {
        int planToRetire, startSaving, planToSave;
        while (true) {
            planToRetire = readInt("What year do you plan to retire? ");
            if(planToRetire < 2028)  {
                println("You need entered correct year.");
            } else {
                break;
            }
        }
        while (true) {
            startSaving = readInt("What year do you plan to start saving? ");
            if(startSaving > planToRetire) {
                println("You need entered correct year.");
            } else  {
                break;
            }
        }
        while (true) {
            planToSave = readInt("How much $ per year do you plan to save? ");
            if(planToSave < 0) {
                println("You need entered correct money");
            } else {
                break;
            }
        }
        double years = planToRetire - startSaving;
        double result = planToSave * (Math.pow(1 + PROCENT, years) - 1) / PROCENT * (1 + PROCENT);

        println("In " + planToRetire + ", you'd have around $" + Math.round(result));

    }
}
