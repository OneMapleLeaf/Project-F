package World;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private boolean KeyW, KeyS, KeyA, KeyD;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W -> KeyW = true;
            case KeyEvent.VK_S -> KeyS = true;
            case KeyEvent.VK_A -> KeyA = true;
            case KeyEvent.VK_D -> KeyD = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W -> KeyW = false;
            case KeyEvent.VK_S -> KeyS = false;
            case KeyEvent.VK_A -> KeyA = false;
            case KeyEvent.VK_D -> KeyD = false;
        }
    }

    public boolean W_Pressed(){
        return KeyW;
    }
    public boolean S_Pressed(){
        return KeyS;
    }
    public boolean A_Pressed(){
        return KeyA;
    }
    public boolean D_Pressed(){
        return KeyD;
    }
}
