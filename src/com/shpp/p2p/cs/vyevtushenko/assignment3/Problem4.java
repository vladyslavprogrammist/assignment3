package com.shpp.p2p.cs.vyevtushenko.assignment3;

import acm.util.RandomGenerator;
import com.shpp.cs.a.console.TextProgram;

import java.util.Random;

public class Problem4 extends TextProgram {
    public void run() {
        int moneyPlayer1, moneyPlayer2;
        while (true) {
         moneyPlayer1=readInt("How many money player 1?:  ");
         if(moneyPlayer1 < 1) {
             println("Please enter a number more than 0");
         } else {
             break;
         }
        }
        while (true) {
            moneyPlayer2=readInt("How many money player 2?:  ");
            if(moneyPlayer2 < 1) {
                println("Please enter a number more than 0");
            } else {
                break;
            }
        }

        int player1, player2;


        while(true) {
            player1=rand();
            println("Player1 has " + moneyPlayer1 + " coins");
            println("Player2 has " + moneyPlayer2 + " coins");
            if(player1 == 1) {
                moneyPlayer1--;
                moneyPlayer2++;

            }
            println("Player1 has " + moneyPlayer1 + " coins");
            println("Player2 has " + moneyPlayer2 + " coins");
            player2=rand();
            if(player2 == 1) {
                moneyPlayer2--;
                moneyPlayer1++;


            }
            if(moneyPlayer1 < 1 || moneyPlayer2 < 1) {
                break;
            }
        }
        if(moneyPlayer1 > 0) {
            println("Player 1 wins");
        } else  if(moneyPlayer2 > 0) {
            println("Player 2 wins");
        } else {
            println("No one wins");
        }
    }

    private int rand() {
        RandomGenerator rg = RandomGenerator.getInstance();
        return rg.nextInt(0,1);
    }
}
