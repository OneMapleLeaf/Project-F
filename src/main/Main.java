package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GamePanel gPanel = new GamePanel();
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Project-F");
        window.add(gPanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
