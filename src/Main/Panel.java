package Main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{
    final double fps = 60;
    Panel(){
        this.setPreferredSize(new Dimension(800, 600));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
    Thread gameThread;

    public void update(){
    }

    public void paint(Graphics gg) {
        super.paint(gg);
        Graphics2D g = (Graphics2D) gg;

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
