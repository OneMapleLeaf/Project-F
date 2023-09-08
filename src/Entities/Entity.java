package Entities;

import java.awt.image.BufferedImage;
public class Entity {
    public int x, y;
    public double speed;

    public BufferedImage frame1, frame2, frame3, frame4, frame5;
    public String direction;
    BufferedImage currentImage = null;
    public int AnimFrame;
    public int MaxFrame;
    public  int AnimDelayMilli, AnimFrameTimeMilli;
}
