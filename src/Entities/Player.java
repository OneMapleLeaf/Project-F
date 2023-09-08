package Entities;

import Main.*;
import Main.Panel;
import World.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Entity{
    Panel panel;
    KeyHandler key;
    Tool tool;
    public Player(Panel panel, KeyHandler key, Tool tool){
        this.panel = panel;
        this.key = key;
        this.tool = tool;
        DefaultValues();
    }

    public void update(){
        if(key.W_Pressed()) y-=speed;
        if(key.S_Pressed()) y+=speed;
        if(key.A_Pressed()) x-=speed;
        if(key.D_Pressed()) x+=speed;
    }
    public void DefaultValues(){
        x = 100;
        y = 100;
        speed = 10 * panel.FrameTime;
        MaxFrame = 4;
        AnimFrame = 0;
//        currentImage = frame1;
        AnimDelayMilli = 100;
        AnimFrameTimeMilli = AnimDelayMilli;
    }

    public void draw(Graphics2D g){
        g.setColor(Color.red);
        g.fillRect(x, y, 50, 50);
    }


}
