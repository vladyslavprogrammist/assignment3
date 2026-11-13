package com.shpp.p2p.cs.vyevtushenko.assignment3;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Problem5 extends WindowProgram {
    private static final double X = 20;
    private static final double Y = 20;
    private static final double WIDTH = 150;
    private static final double HEIGHT = 150;
    private static final double PAUSE_TIME = 1000.0 / 48 * 4;
    private static final double HORIZONTAL_VELOCITY = 18.0;
    private static final double GRAVITY = 0.4;
    public void run() {


        cloud();
        floor();
        oval();

    }

    private void oval() {
        GOval oval = new GOval(X,Y,WIDTH,HEIGHT);
        oval.setFilled(true);
        oval.setColor(Color.BLACK);
        oval.setFillColor(Color.YELLOW);
        add(oval);
        ovalGo(oval);
    }

    private void ovalGo(GOval oval) {
        long startTime = System.currentTimeMillis();
        double dy = 0;
        while (System.currentTimeMillis() - startTime < 5000) {
            oval.move(HORIZONTAL_VELOCITY, dy);
            dy += GRAVITY;
            pause(PAUSE_TIME);
        }
    }


    private void floor() {
        GRect rect = new GRect(0, getHeight()*1.5, getWidth() * getWidth(), getHeight() * getHeight());
        rect.setFilled(true);
        rect.setColor(Color.BLACK);
        rect.setFillColor(Color.GREEN);
        add(rect);
    }

    private void cloud() {
        GRect rect = new GRect(getWidth() * getWidth(), getHeight()*1.5);
        rect.setFilled(true);
        rect.setColor(Color.BLACK);
        rect.setFillColor(Color.BLUE);
        add(rect);
    }
}
