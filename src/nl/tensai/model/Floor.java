package nl.tensai.model;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public class Floor extends GameObject {
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    public Floor(int xPos, int yPos) {
        super(xPos, yPos, WIDTH, HEIGHT);
    }
}