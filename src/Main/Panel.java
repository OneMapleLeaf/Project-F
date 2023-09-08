package Main;

import Entities.*;
import World.*;
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{
    public static final int ScreenWidth = 800, ScreenHeight = 600;
    final static double fps = 60;
    public static double FrameTime = (double) 100/fps;

    KeyHandler key = new KeyHandler();
    Tool playerTool = new Tool();
    Player player = new Player(this, key, playerTool);
    Panel(){
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.addKeyListener(key);
    }
    Thread gameThread;

    public void update(){
        player.update();
        System.out.println(FrameTime * 10);
    }

    public void paint(Graphics gg) {
        super.paint(gg);
        Graphics2D g = (Graphics2D) gg;
        player.draw(g);
        g.drawString("FPS: " + fps, 10, 10);
        g.dispose();
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000 /fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }
}
