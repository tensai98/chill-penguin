package nl.tensai.main;

import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * Created by Chi Joung so <chijoung@gmail.com on 2-10-2018.
 */
public abstract class LevelState extends JPanel {

    protected static final long serialVersionUID = 1L;

    //Base Screen Size
    public static final int SCREEN_WIDTH = 500;
    public static final int SCREEN_HEIGHT = 400;

    // Possible Level States
    public static final int START_STATE = -1;
    public static final int INITIAL_SCREEN = 0;
    public static final int GETTING_READY = 1;
    public static final int PLAYING = 2;
    public static final int NEW_MEGAMAN = 3;
    public static final int LEVEL_WON = 6;
    public static final int GAME_OVER_SCREEN = 7;
    public static final int GAME_OVER = 8;
    private int currentState = START_STATE;
    private int startState = START_STATE;

    private MainFrame mainFrame;
    private int level;
    private Graphics2D g2d;

    // Getters

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public int getLevel() {
        return level;
    }

    public Graphics2D getGraphics2D() {
        return g2d;
    }

    public int getCurrentState() {
        return currentState;
    }

    public int getStartState() {
        return startState;
    }

    // Setters
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGraphics2D(Graphics2D g2d) {
        this.g2d = g2d;
    }

    public void setCurrentState(int nextState) {
        this.currentState = nextState;
    }

    public void setStartState(int startState) {
        this.startState = startState;
    }

    // Level FSM state methods
    public abstract void doStart();

    public abstract void doInitialScreen();

    public abstract void doGettingReady();

    public abstract void doPlaying();

    public abstract void doNewMegaman();

    public abstract void doGameOverScreen();

    public abstract void doGameOver();

    public abstract void doLevelWon();

    public abstract boolean isLevelWon();

    // Game Actions in response to user controls
    public abstract void fireBullet();

    public abstract void fireBigBullet();

    public abstract void moveMegaManUp();

    public abstract void moveMegaManDown();

    public abstract void moveMegaManLeft();

    public abstract void moveMegaManRight();

    public abstract void speedUpMegaMan();

    public abstract void slowDownMegaMan();

}