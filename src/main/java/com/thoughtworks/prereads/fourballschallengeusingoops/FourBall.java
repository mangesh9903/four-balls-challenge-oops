package com.thoughtworks.prereads.fourballschallengeusingoops;

import processing.core.PApplet;

/**
 *  Class :- Class for Four Ball Challenge Using Oops Concepts.
 * @author Mangesh
 */
public class FourBall extends PApplet {
    public static final int CIRCLE = 30;
    public static final int HEIGHT = 800;
    public static final int WIDTH = 1000;

    Ball firstBall;
    Ball secondBall;
    Ball thirdBall;
    Ball fourthBall;

    public static void main(String[] args) {
        PApplet.main("com.thoughtworks.prereads.fourballschallengeusingoops.FourBall",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        firstBall = new Ball(0, (HEIGHT * 1) / 5, 1);
        secondBall = new Ball(0, (HEIGHT * 2) / 5, 2);
        thirdBall = new Ball(0, (HEIGHT * 3) / 5, 3);
        fourthBall = new Ball(0, (HEIGHT * 4) / 5, 4);
    }

    @Override
    public void draw() {
        drawCircle(firstBall);
        drawCircle(secondBall);
        drawCircle(thirdBall);
        drawCircle(fourthBall);
    }

    /** Method :- Method to Draw Circle.
     * @param ball :- Passing ball as input parameter.
     */
    public void drawCircle(Ball ball) {
        ellipse(ball.ballAtXCoordinate, ball.ballAtYCoordinate, CIRCLE, CIRCLE);
        ball.ballAtXCoordinate = ball.ballAtXCoordinate + ball.speedOfBall;
    }
}
