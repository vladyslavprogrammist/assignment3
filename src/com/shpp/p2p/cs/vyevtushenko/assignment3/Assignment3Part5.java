package com.shpp.p2p.cs.vyevtushenko.assignment3;

import acm.util.RandomGenerator;
import com.shpp.cs.a.console.TextProgram;

import java.util.Random;

public class Assignment3Part5 extends TextProgram {

    public void run() {
        int randMonet;
        int total = 0, quantityGames = 0, money = 1;

        while (total < 20) {

            randMonet = rand();
            if(randMonet == 0) {
                money += money;
            } else {
                total += money;
                println("This game, you earned $" + money);
                println("Your total is $" + total);
                money = 1;
                quantityGames++;
            }
        }
        println("It took " + quantityGames + " games to earn $" + total);
    }

    private int rand() {
        RandomGenerator rg = RandomGenerator.getInstance();
        return rg.nextInt(0,1);
    }
}
