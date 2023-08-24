package entities;

import java.awt.*;

public class Player extends Entity {

    public Player(int worldX, int worldY){
        posX = worldX;
        posY = worldY;
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(posX, posY, 25, 25);
    }

}
