package nl.tensai.model;

import java.awt.Rectangle;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public class Platform extends Rectangle {
    private static final long serialVersionUID = 1L;

    private static final int WIDTH = 44;
    private static final int HEIGHT = 4;

    public Platform(int xPos, int yPos) {
        super(xPos, yPos, WIDTH, HEIGHT);
    }
}