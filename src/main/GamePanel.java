package main;

import entities.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    final int tileSize = 48; //48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    final int SCREEN_WIDTH = tileSize * maxScreenCol; // 768 Pixels
    final int SCREEN_HEIGHT = tileSize * maxScreenRow; // 576 Pixels

    Timer time = new Timer(16, this);
    Player player;

    public GamePanel(){

        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        player = new Player(SCREEN_WIDTH/2, SCREEN_HEIGHT/2); // PLACEHOLDER COORDINATES

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        player.draw(g2d);
    }
    public void startGame(){
        time.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
