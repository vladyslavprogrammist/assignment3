package com.shpp.p2p.cs.vyevtushenko.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part1 extends TextProgram {
    static final int TIMES = 7;
    static final int minutes30 = 30;
    static final int minutes40 = 40;

    public void run() {
        int minutes, countMinutes30 = 0, countMinutes40 = 0;
        for (int i = 0; i<TIMES; i++){
            minutes = readInt("How many minutes did you do on day " + (i+1) + "? ");
            if(minutes < 0) {
                println("Error input! Try again!");
                i--;
            }
            else {
                if(minutes >= minutes30) {
                    countMinutes30++;
                }
                if(minutes >= minutes40) {
                    countMinutes40++;
                }
            }
        }

        println("Cardiovascular health: ");
        if(countMinutes30 >= 5){
            println("\tGreat job! You've done enough exercise for cardiovascular health.");
        } else {
            println("\tYou needed to train hard for at least " + (5 - countMinutes30) + " more day(s) a week!");
        }

        println("Blood pressure: ");
        if(countMinutes40 >= 3){
            println("\tGreat job! You've done enough exercise to keep a low blood pressure.");
        } else{
            println("\tYou needed to train hard for at least  " + (3 - countMinutes40) + " more day(s) a week!");
        }
    }
}
