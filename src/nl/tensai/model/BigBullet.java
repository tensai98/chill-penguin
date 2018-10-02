package nl.tensai.model;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public class BigBullet extends GameObject {
    private static final long serialVersionUID = 1L;

    public static final int DEFAULT_SPEED = 2;
    public static final  int WIDTH = 16;
    public static final int HEIGHT = 16;

    public BigBullet(int xPos, int yPos) {
        super(xPos, yPos, WIDTH, HEIGHT);
        this.setSpeed(12);
    }
    public int getDefaultSpeed(){
        return DEFAULT_SPEED;
    }
}