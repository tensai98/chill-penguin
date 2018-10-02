package nl.tensai.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Main game screen. Handles all game graphics updates and some of the game logic.
 * <p>
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public class Level1State extends LevelState {

    private static final long serialVersionUID = 1L;
    //protected GraphicsManager graphicsManager;
    protected BufferedImage backBuffer;
    protected int numPlatforms = 8;

    protected int damage = 0;
    protected static final int NEW_MEGAMAN_DELAY = 500;
    protected static final int NEW_ASTEROID_DELAY = 500;

    protected long lastAsteroidTime;
    protected long lastLifeTime;

    protected Rectangle asteroidExplosion;

    protected Random rand;

    protected Font originalFont;
    protected Font bigFont;
    protected Font biggestFont;

    protected int levelAsteroidsDestroyed = 0;

    // Constructors
    public Level1State(int level, MainFrame frame) {
        super();
        this.setSize(new Dimension((int) (frame.getWidth() * 0.9), (int) (frame.getWidth() * 0.81)));
        this.setPreferredSize(new Dimension((int) (frame.getWidth() * 0.9), (int) (frame.getWidth() * 0.81)));
        this.setBackground(Color.BLACK);
        this.setLevel(level);
        this.setMainFrame(frame);
        backBuffer = new BufferedImage(SCREEN_WIDTH, SCREEN_HEIGHT, BufferedImage.TYPE_INT_RGB);
        this.setGraphics2D(backBuffer.createGraphics());
        rand = new Random();
    }

    // Level state methods
    // The method associated with the current level state will be called
    // repeatedly during each LevelLoop iteration until the next a state
    // transition occurs
    // To understand when each is invoked see LevelLogic.stateTransition() & LevelLoop class

    @Override
    public void doStart() {

        setStartState(START_STATE);
        setCurrentState(getStartState());

        lastAsteroidTime = -NEW_ASTEROID_DELAY;
        lastLifeTime = -NEW_MEGAMAN_DELAY;

        bigFont = originalFont;
        biggestFont = null;
    }

    @Override
    public void doInitialScreen() {
        setCurrentState(INITIAL_SCREEN);
        clearScreen();
    }

    @Override
    public void doGettingReady() {

    }



    @Override
    public void doPlaying() {
        setCurrentState(PLAYING);
        updateScreen();
    }

    ;

    @Override
    public void doNewMegaman() {
        setCurrentState(NEW_MEGAMAN);
    }

    ;

    @Override
    public void doLevelWon() {

    }

    @Override
    public void doGameOverScreen() {

    }

    @Override
    public void doGameOver() {
    }

    /**
     * Update the game screen.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(getSize().getWidth() / SCREEN_WIDTH, getSize().getHeight() / SCREEN_HEIGHT);
        g2.drawImage(backBuffer, 0, 0, this);
    }

    /**
     * Update the game screen's backbuffer image.
     */
    public void updateScreen() {

    }


    protected void clearScreen() {
        // clear screen
        Graphics2D g2d = getGraphics2D();
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0, 0, getSize().width, getSize().height);
    }

    /**
     * Draws the specified number of stars randomly on the game screen.
     *
     * @param numberOfStars the number of stars to draw
     */
    protected void drawStars(int numberOfStars) {
        Graphics2D g2d = getGraphics2D();
        g2d.setColor(Color.WHITE);
        for (int i = 0; i < numberOfStars; i++) {
            int x = (int) (Math.random() * this.getWidth());
            int y = (int) (Math.random() * this.getHeight());
            g2d.drawLine(x, y, x, y);
        }
    }

    @Override
    public boolean isLevelWon() {
        return levelAsteroidsDestroyed >= 3;
    }

    @Override
    public void fireBullet() {

    }

    @Override
    public void fireBigBullet() {

    }

    @Override
    public void moveMegaManUp() {

    }

    @Override
    public void moveMegaManDown() {

    }

    @Override
    public void moveMegaManLeft() {

    }

    @Override
    public void moveMegaManRight() {

    }

    @Override
    public void speedUpMegaMan() {

    }

    @Override
    public void slowDownMegaMan() {

    }
}