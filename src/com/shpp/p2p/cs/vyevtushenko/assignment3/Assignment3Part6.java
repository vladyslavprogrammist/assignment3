package com.shpp.p2p.cs.vyevtushenko.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part6 extends WindowProgram {
    private static final double X = 10;
    private static final double Y = 20;
    private static final double WIDTH = 150;
    private static final double HEIGHT = 100;
    private static final double PAUSE_TIME = 1000.0 / 48 * 4;
    private static final double HORIZONTAL_VELOCITY = 18.0;
    private static final double GRAVITY = 0.4;

    public void run() {
        GRect rect = makeRect();
        add(rect);
        rectGo(rect);
    }

    private void rectGo(GRect rect) {
        long startTime = System.currentTimeMillis();
        double dy = 0;
        while (System.currentTimeMillis() - startTime < 5000) {
            rect.move(HORIZONTAL_VELOCITY, dy);
            dy += GRAVITY;
            pause(PAUSE_TIME);
        }
    }



    private GRect makeRect() {
        GRect rect = new GRect(X, Y, WIDTH, HEIGHT);
        rect.setFilled(true);
        rect.setColor(Color.RED);
        rect.setFillColor(Color.GREEN);
        return rect;
    }
}
