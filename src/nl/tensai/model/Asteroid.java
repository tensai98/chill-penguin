package nl.tensai.model;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public class Asteroid extends GameObject {
    private static final long serialVersionUID = 1L;

    public static final int DEFAULT_SPEED = 4;

    public static final int WIDTH = 32;
    public static final int HEIGHT = 32;

    public Asteroid(int xPos, int yPos) {
        super(xPos, yPos, Asteroid.WIDTH, Asteroid.HEIGHT);
        this.setSpeed(DEFAULT_SPEED);
    }

    public int getDefaultSpeed() {
        return DEFAULT_SPEED;
    }
}