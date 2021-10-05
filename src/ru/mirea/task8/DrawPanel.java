package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("src/ru/mirea/task8/image.jpg").getImage();
        //Image image = new ImageIcon("src/ru/mirea/task8/cat.gif").getImage();
        g.drawImage(image, 0, 0, this);
    }
}
