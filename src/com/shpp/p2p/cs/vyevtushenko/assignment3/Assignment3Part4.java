package com.shpp.p2p.cs.vyevtushenko.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part4 extends WindowProgram {
    private static final int BRICK_HEIGHT = 40;
    private static final int BRICK_WIDTH = 100;
    private static final int BRICKS_IN_BASE = 10;
    public void run() {
        int rightGo = getWidth() / 2;
        int upperGo = getHeight() + getHeight() + getHeight() / 2;
        int counter = 0;
        int counter2 = BRICKS_IN_BASE -1;
        for(int i = 0; i < BRICKS_IN_BASE; i++) {
            for(int j = 0; j < BRICKS_IN_BASE; j++) {
                GRect rect = new GRect(rightGo,  upperGo, BRICK_WIDTH, BRICK_HEIGHT);
                rect.setFilled(true);
                rect.setColor(Color.BLACK);
                rect.setFillColor(Color.RED);
                add(rect);
                rightGo += BRICK_WIDTH;
                if(j == counter2) {
                    counter2--;
                    break;
                }
            }
            counter += (BRICK_WIDTH /2);
            rightGo = getWidth() / 2 + counter;
            upperGo -= BRICK_HEIGHT;
        }
    }
}
