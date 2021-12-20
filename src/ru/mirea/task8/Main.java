package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

import ru.mirea.task8.ShapePainting;

public class Main {
    public static void main(String[] args) {
        new ShapePainting().setVisible(true);
        //new ImagePainting().setVisible(true);

        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();

        frame.getContentPane().add(panel);

        frame.setSize(300, 320);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
